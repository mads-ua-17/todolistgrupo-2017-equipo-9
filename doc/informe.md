# Todo-List

Martín Laiz y Ramsés Martínez


## 1 - Historias de usuario

Historias de usuarios realizadas durante la realización de la práctica.

- Crear tareas en un tablero
    - Como usuario quiero poder crear tareas en uno de sus tableros para poder gestionarlas.

- Añadir columnas al tablero
    - Como usuario quiero poder añadir columnas a un tablero para poder agrupar tareas en dichas columnas.

- Gestionar etiquetas de tableros
    - Como usuario quiero poder crear etiquetas en tableros para poder asignarlas a tareas concretas y de esta manera poder filtrarlas.

- Gestionar etiquetas de tareas
    - Como usuario quiero poder asignar etiquetas a tareas para poder diferenciarlas.

### 1.1 - Descricpión y COS de las historias

<table>
<tr>
<td><img src="images/HU1.PNG" width="700px"/></td>
</tr>
<tr>
<td align="center"> Crear tareas en un tablero </td>
</table>

<table>
<tr>
<td><img src="images/HU2.PNG" width="700px"/></td>
</tr>
<tr>
<td align="center"> Añadir columnas al tablero </td>
</table>

<table>
<tr>
<td><img src="images/HU3.PNG" width="700px"/></td>
</tr>
<tr>
<td align="center"> Gestionar etiquetas de tableros </td>
</table>

<table>
<tr>
<td><img src="images/HU3.PNG" width="700px"/></td>
</tr>
<tr>
<td align="center"> Gestionar etiquetas de tareas </td>
</table>


## 2 - Metodología seguida

Tras varios intentos de llevar al cabo una metodología, dados los problemas encontrados y la situación de trabajo con otras asignaturas nos fué muy difícil el seguir una metodología.

Aún así, hemos tratado de seguir una metodología SCRUM, intentando estar comunicándonos continuamente entre los integrantes del grupo, además de la colaboración continua entre nosotros, tanto aportando ideas nuevas, como aconsejando o ayudando en campos concretos.

Tambien, hemos intentado ceñirnos a la planificación, pero como explicamos en la parte de los **daily meetings**, hemos tenido problemas para mantener un desarrollo continuo que se acerque a lo que una empresa real pueda llegar a realizar en sus jornadas. Pese a eso, hemos intentado acercarnos lo máximo posible, habiendo tenido relativo éxito a la hora de cumplir las reglas básicas de SCRUM, pero no hemos conseguido mantenerlo durante todas las semanas.


## 3 - Funcionalidades implementadas

- Tableros incluyen tareas
    - Los tableros agruparan las tareas.
    - Una tarea solo puede pertenecer a un único tablero y un tablero puede tener muchas tareas.

- Crear columnas en tableros
    - Se pueden crear columnas en los tablero para agrupar las tareas según las necesidades.
    - Un tablero puede contener muchas columnas, pero no repetidas, y una columna sólo puede existir en un único tablero.

- Asignar tareas a columnas
    - Las columnas pueden contener tareas para agruparlas.
    - Una columna puede contener muchas tareas únicas y una tarea solo puede pertenecer a una columna.

- Crear etiquetas
    - La creación de etiquetas está orientada a diferenciar las tareas según un criterio. Las etiquetas están asociadas a los tableros.
    - Una etiqueta sólo puede pertenecer a un tablero y un tablero puede incluir muchos etiquetas.

- Asignar  etiquetas
    - Se podrán asignar etiquetas a tareas para diferenciarlas más fácilmente.
    - Un a tarea puede tener muchas etiquetas y una etiqueta puede estar en más de una tarea.

- Filtrado por etiqueta
    - Haciendo uso de las etiquetas, podremos mostrar solo las tareas que incluyan sólo esa etiqueta.
    - Al establecer el filtro con una etiqueta solo se mostrarán las tareas con esa etiqueta y al seleccionar otra etiqueta se filtrará solo esa etiqueta.


##  4 - Daily Meetings

En este apartado vamos a comentar las distintas reuniones que hemos realizado a lo largo del sprint, simulando las reuniones diarias en una empresa real.

Durante algunos días, también hemos tenido que discutir (en el sentido inglés de la palabra) como reorganizar el trabajo o sobre cómo realizar alguna de las tareas que propusimos en su momento, por lo que, podrían ser perfectamente reuniones diarias, pero únicamente vamos a comentar las que fueron “Oficiales”.


### 4.1 - Miércoles 6 de Diciembre

En esta reunión hablamos sobretodo del problema que nos encontramos, debido a un problema que tuvimos a la hora de realizar actualizaciones de una columna o de una tarea, puesto que al parecer, no teníamos bien implementada una sección del código, donde se realizaba todo este tipo de peticiones a la base de datos.

Además, tuvimos que hablar sobre el planteamiento de las historias de usuario siguientes, para no volver a cometer el fallo de atascarnos en los mismos puntos e intentar agilizar un poco más el transcurso del proyecto.

Terminamos la reunión hablando de algunas cosas que podíamos mejorar de las historias que teníamos asignadas, y también si habíamos encontrado algún fallo o algo que remarcar del trabajo realizado hasta el momento.


### 4.2 - Miércoles 13 de Diciembre

En esta ocasión, debido a un mal planteamiento de cómo debería quedar la aplicación final, nos retrasamos en demasía, puesto que, de la forma en que estaba planteada, había que reestructurar todo el proyecto, puesto que intentábamos hacer que el usuario, no pudiese tener tareas sin estar asignadas a ningún tablero y que en caso de querer tener tareas, debería de crear un tablero. Todo esto convertía la história de usuario de **mediana** a **grande**, haciendo que requiriese de mucho más tiempo para terminarla.

Gracias a la opinión del profesor, y tras debatirlo durante un momento, llegamos a la conclusión de que realmente estábamos planteando mal la história, y podríamos simplemente mantener las tareas de un usuario y además, tener tableros con sus respectivas tareas y simplemente, al menos, **en este sprint**, dejarlo de esta manera.

También debido a una dependencia entre las tareas de “creación de etiquetas” y “filtrado por etiquetas”, que no nos dimos cuenta, fuimos perdiendo cortos periodos de tiempo (desde un par de horas hasta un día) que nos retrasaron.

Por todo ello, perdimos un tiempo muy valioso, que hizo que la última semana tuviésemos mucha más carga de trabajo y que además, tuviésemos muy poco tiempo para terminar, revisar y además ultimar detalles de los modelos y servicios.


## 5 - Retrospectiva

Podemos decir, pese a algunos fallos que hemos cometido durante el último **sprint** que nos hemos adaptado bien a los cambios y problemas surgidos, puesto que hemos sido capaces de detectar un problema a tiempo (más o menos) y cambiar la **perspectiva** o la forma de entender las **historias de usuario**, pudiendo finalmente terminarlas de manera correcta en mayor o menor éxito, pero consiguiendo realizar la demostración en clase, sin muchos problemas.

Pero somos conscientes de que han habido problemas y que con experiencia, podrían haberse detectado y solucionado, mucho antes, sin las consecuiencias que ello conlleva, como en nuestro caso, hemos sufrido retraso en alguna história e incluso retrasos en tareas que a **priori** no deberíab ser muy complicadas. Por lo tanto, hemos aprendido mucho de nuestros errores y creo que eso es lo que realmente aporta valor a nuestro equipo, pese a los fallos.

Por lo tanto, para mejorar, en concreto, podríamos tratar de mejorar **la planificación inicial**, ya que, fruto de ella, hemos cometido errores que tal vez, podramos haber sorteado con menor dificultad, si hubiésemos tratado con un poco más de profundidad cada una de las **historias de usuario** o incluso a la hora de **fragmentar** la historia en tareas o **issues**. Además, creo que también podríamos haber puesto menos incapié en el diseño, en estas fases tan tempranas y centrarnos más en las **funcionalidades**, ya que realmente, el diseño es algo que en un desarrollo más largo, podría llegar a ser algo menos prioritario o incluso prácticamente inecesario, en un primer mes de **sprint** y tratar de mostrar de manera más sencilla como estaría estructurada la aplicación web y utilizar por ejemplo **Bootstrap** plano, para mostrar que realmen<te funciona todo lo que el cliente nos ha pedido, de una manera, tal vez, menos visual, pero más clara.

En conclusión y para termianr, tras la valoración de los resultados y de los problemas encontrados, nos dimos cuenta que una buena planificación inicial (aunque se gaste tiempo) es muy útil ya que se pueden resolver dependencias entre tareas y nos ayuda a gestionarnos mejor el tiempo.
