package co.edu.ue.repository;

import java.util.List;

import co.edu.ue.Entity.Perfil;


public interface IPerfilRepository {

	Object findById(int id);

	List<Perfil> findAll();
	
	Perfil save(Perfil perfil);

	Perfil update(Perfil perfil);

	void delete(int id);

}
