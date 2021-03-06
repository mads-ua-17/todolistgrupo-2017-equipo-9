package services;

import javax.inject.*;

import java.util.Date;

import models.Usuario;
import models.UsuarioRepository;


public class UsuarioService {
   UsuarioRepository repository;

   // Play proporcionará automáticamente el UsuarioRepository necesario
   // usando inyección de dependencias
   @Inject
   public UsuarioService(UsuarioRepository repository) {
      this.repository = repository;
   }

   public Usuario creaUsuario(String login, String email, String password) {
      if (repository.findByLogin(login) != null) {
         throw new UsuarioServiceException("Login ya existente");
      }
      Usuario usuario = new Usuario(login, email);
      usuario.setPassword(password);
      return repository.add(usuario);
   }

   public Usuario modificaUsuario(String login, String nuevoEmail, String nuevoNombre,
                                  String nuevosApellidos, Date nuevaFechaNacimiento) {
      Usuario usuario = repository.findByLogin(login);
      if (usuario == null)
           throw new UsuarioServiceException("No existe el usuario");
      usuario.setEmail(nuevoEmail);
      usuario.setNombre(nuevoNombre);
      usuario.setApellidos(nuevosApellidos);
      usuario.setFechaNacimiento(nuevaFechaNacimiento);
      usuario = repository.update(usuario);
      return usuario;
   }

   public Usuario findUsuarioPorLogin(String login) {
      return repository.findByLogin(login);
   }

   public Usuario findUsuarioPorId(Long id) {
      return repository.findById(id);
   }

   public Usuario login(String login, String password) {
      Usuario usuario = repository.findByLogin(login);
      if (usuario != null && usuario.getPassword().equals(password)) {
         return usuario;
      } else {
         return null;
      }
   }
}
