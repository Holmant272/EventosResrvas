package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.Entity.Perfil;
import co.edu.ue.repository.PerfilRepository;

@Service
public class PerfilService implements IPerfilService{

	@Autowired
    private PerfilRepository Repository;

    public List<Perfil> findAll() {
        return Repository.findAll();
    }

    public Perfil findById(int id) {
        return Repository.findById(id);
    }

    public Perfil insert(Perfil Perfil) {
        return Repository.save(Perfil);
    }
    
    public Perfil update(Perfil Perfil) {
        return Repository.update(Perfil);
    }

	public void delete(int id) {
		Repository.delete(id);
	}
}
