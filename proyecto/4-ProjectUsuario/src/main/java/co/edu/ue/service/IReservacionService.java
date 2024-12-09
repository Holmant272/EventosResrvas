package co.edu.ue.service;

import java.util.List;

import co.edu.ue.Entity.Reservacion;

public interface IReservacionService {

	List<Reservacion> findAll();

	Reservacion findById(int id);

	Reservacion insert(Reservacion Reservacion);
	Reservacion update(Reservacion Reservacion);

	void delete(int idevento);
}
