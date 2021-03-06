import org.junit.*;

import static org.junit.Assert.*;

import play.db.jpa.*;

import org.dbunit.*;
import org.dbunit.dataset.*;
import org.dbunit.dataset.xml.*;
import org.dbunit.operation.*;

import java.io.Console;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import play.inject.guice.GuiceApplicationBuilder;
import play.inject.Injector;
import play.inject.guice.GuiceInjectorBuilder;
import play.Environment;

import models.Etiqueta;
import services.EtiquetaService;
import services.EtiquetaServiceException;

import models.Tablero;
import services.TableroService;
import services.TableroServiceException;

public class EtiquetaServiceTest {
	static private Injector injector;

	@BeforeClass
	static public void initApplication() {
		GuiceApplicationBuilder guiceApplicationBuilder = new GuiceApplicationBuilder().in(Environment.simple());
		injector = guiceApplicationBuilder.injector();
		injector.instanceOf(JPAApi.class);
	}

	@Before
	public void initData() throws Exception {
		JndiDatabaseTester databaseTester = new JndiDatabaseTester("DBTest");
		IDataSet initialDataSet = new FlatXmlDataSetBuilder()
				.build(new FileInputStream("test/resources/usuarios_dataset.xml"));
		databaseTester.setDataSet(initialDataSet);
		databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
		databaseTester.onSetup();
	}

	private EtiquetaService newEtiquetaService() {
		return injector.instanceOf(EtiquetaService.class);
	}
	
	@Test
	public void getEtiquetaTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		Etiqueta etiqueta = etiquetaService.getEtiqueta(1000L);
		assertEquals("SGT-2", etiqueta.getNombre());
	}

	@Test(expected = EtiquetaServiceException.class)
	public void getEtiquetaNoExisteTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		Etiqueta etiqueta = etiquetaService.getEtiqueta(52545L);
	}	

  @Test
	public void getEtiquetasTableroTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		List<Etiqueta> etiquetas = etiquetaService.getEtiquetasTablero(1000L);
		assertEquals(1, etiquetas.size());
	}

	@Test(expected = EtiquetaServiceException.class)
	public void getEtiquetasTableroNoExisteTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		List<Etiqueta> etiquetas = etiquetaService.getEtiquetasTablero(3000L);
	}

	@Test
	public void crearEtiquetaTableroTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		List<Etiqueta> etiquetas = etiquetaService.getEtiquetasTablero(1000L);
		assertEquals(1, etiquetas.size());
		etiquetaService.crearEtiquetaTablero(1000L, "refactor", "ffffff");

		etiquetas = etiquetaService.getEtiquetasTablero(1000L);
		assertEquals(2, etiquetas.size());
	}

	@Test(expected = EtiquetaServiceException.class)
	public void crearEtiquetaTableroNoExisteTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		etiquetaService.crearEtiquetaTablero(3000L, "refactor", "ffffff");
	}

	@Test
	public void modificarEtiquetaTableroTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		Etiqueta etiqueta = etiquetaService.getEtiqueta(1000L);
		etiqueta = etiquetaService.modificarEtiquetaTablero(1000L, "bugs", "384598");
		Etiqueta actualizada = etiquetaService.getEtiqueta(1000L);
		assertEquals("384598", actualizada.getColor());
	}

	@Test(expected = EtiquetaServiceException.class)
	public void modificarEtiquetaNoExisteTableroTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		Etiqueta etiqueta = etiquetaService.getEtiqueta(1000L);
		etiqueta = etiquetaService.modificarEtiquetaTablero(3000L, "bugs", "384598");
	}


	@Test
	public void eliminarEtiquetaTableroTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		List<Etiqueta> etiquetas = etiquetaService.getEtiquetasTablero(1000L);
		assertEquals(1, etiquetas.size());
		etiquetaService.eliminarEtiquetaTablero(1000L);
		etiquetas = etiquetaService.getEtiquetasTablero(1000L);
		assertEquals(0, etiquetas.size());
	}

	@Test(expected = EtiquetaServiceException.class)
	public void eliminarEtiquetaNoExisteTableroTest() {
		EtiquetaService etiquetaService = newEtiquetaService();
		etiquetaService.eliminarEtiquetaTablero(3000L);
	}
}