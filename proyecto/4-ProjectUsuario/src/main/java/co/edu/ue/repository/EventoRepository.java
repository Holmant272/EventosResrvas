package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.Entity.Evento;
import co.edu.ue.repositoryJPA.IEvento;
import jakarta.persistence.EntityNotFoundException;

@Repository
public class EventoRepository implements IEventoRepository{

	@Autowired
    IEvento JPA;

	@Override
	public Evento findById(int id) {
		return JPA.findById(id).orElse(null);
	}

	@Override
	public List<Evento> findAll() {
		return JPA.findAll();
	}

	@Override
	public Evento save(Evento evento) {
		return JPA.save(evento);
	}
	
	@Override
	public Evento update(Evento evento) {
		if (JPA.existsById(evento.getId())) {
            return JPA.save(evento);
        } else {
            throw new EntityNotFoundException("Evento no encontrado con ID: " + evento.getId());
        }
	}

	@Override
	public void delete(int id) {
		if (JPA.existsById(id)) {
		    JPA.deleteById(id);
        } else {
            throw new EntityNotFoundException("Evento no encontrado con ID: " + id);
        }
	}
}
