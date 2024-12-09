package co.edu.ue.service;

import java.util.List;

import co.edu.ue.Entity.Perfil;

public interface IPerfilService {

	List<Perfil> findAll();

	Perfil findById(int id);

	Perfil insert(Perfil evento);

	Perfil update(Perfil Perfil);

	void delete(int idPerfil);
}
