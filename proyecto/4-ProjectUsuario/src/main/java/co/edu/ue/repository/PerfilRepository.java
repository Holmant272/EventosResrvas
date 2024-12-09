package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.Entity.Perfil;
import co.edu.ue.repositoryJPA.IPerfil;
import jakarta.persistence.EntityNotFoundException;

@Repository
public class PerfilRepository implements IPerfilRepository{

	@Autowired
    IPerfil JPA;

	@Override
	public Perfil findById(int id) {
		return JPA.findById(id).orElse(null);
	}

	@Override
	public List<Perfil> findAll() {
		return JPA.findAll();
	}

	@Override
	public Perfil save(Perfil perfil) {
		return JPA.save(perfil);
	}
	
	@Override
	public Perfil update(Perfil perfil) {
		if (JPA.existsById(perfil.getId())) {
            return JPA.save(perfil);
        } else {
            throw new EntityNotFoundException("Perfil no encontrado con ID: " + perfil.getId());
        }
	}

	@Override
	public void delete(int id) {
		if (JPA.existsById(id)) {
		    JPA.deleteById(id);
        } else {
            throw new EntityNotFoundException("Perfil no encontrado con ID: " + id);
        }
	}
}
