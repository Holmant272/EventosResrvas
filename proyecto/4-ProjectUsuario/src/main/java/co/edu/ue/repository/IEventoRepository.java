package co.edu.ue.repository;

import java.util.List;

import co.edu.ue.Entity.Evento;

public interface IEventoRepository {

	Object findById(int id);

	List<Evento> findAll();
	
	Evento save(Evento descuento);

	Evento update(Evento evento);

	void delete(int id);

}
