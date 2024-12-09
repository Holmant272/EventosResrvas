package co.edu.ue.repository;

import java.util.List;


import co.edu.ue.Entity.Usuario;

//DAO 
public interface IUsuarioRepository {

	Usuario findById(int id);

	List<Usuario> ListUsuarios();

	Usuario insertUsuario(Usuario usuario);

	Usuario updateUsuario(Usuario usuario);

	List<Usuario> findByNombre(String nombre);
	
}
