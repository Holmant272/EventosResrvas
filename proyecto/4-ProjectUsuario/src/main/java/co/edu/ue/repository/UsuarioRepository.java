package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.Entity.Usuario;
import co.edu.ue.repositoryJPA.IUsuarioJPA;

//DAO
@Repository
public class UsuarioRepository implements IUsuarioRepository{
	//Implementar metodos para CRUD
	
	//Implementar metodos personalizados
	
	@Autowired
     IUsuarioJPA usuarioJpa;
	
	
	
	@Override
    public List<Usuario> ListUsuarios() {

        return usuarioJpa.findAll();
    }
	
	@Override
    public Usuario insertUsuario(Usuario usuario) {

        return usuarioJpa.save(usuario);
    }

    //TODO: pendiente actualizar usuario
    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return null;
    }

	@Override
	public List<Usuario> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return usuarioJpa.findById(id).orElse(null);
	}


    /*@Override
    public List<Usuario> findByCalificacion(Calificacion calificaciones) {
        return usujpa.findByCalificacion(calificaciones);
    }*/

    //TODO: pendiente crear actualizar por estado
    /*@Override
    public Usuario updateByEstado(String estado) {
        return usujpa.updateByEstado(estado);
    }*/
}