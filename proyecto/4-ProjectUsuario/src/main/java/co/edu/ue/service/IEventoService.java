package co.edu.ue.service;

import java.util.List;

import co.edu.ue.Entity.Evento;

public interface IEventoService {

	List<Evento> findAll();

	Evento findById(int id);

	Evento insert(Evento evento);

	Evento update(Evento evento);

	void delete(int idevento);

}