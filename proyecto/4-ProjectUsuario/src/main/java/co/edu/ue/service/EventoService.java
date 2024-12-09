package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.Entity.Evento;
import co.edu.ue.repository.EventoRepository;


@Service
public class EventoService implements IEventoService{

	@Autowired
    private EventoRepository Repository;

    public List<Evento> findAll() {
        return Repository.findAll();
    }

    public Evento findById(int id) {
        return Repository.findById(id);
    }

    public Evento insert(Evento evento) {
        return Repository.save(evento);
    }
    
    public Evento update(Evento evento) {
        return Repository.update(evento);
    }

	public void delete(int id) {
		Repository.delete(id);
	}
}
