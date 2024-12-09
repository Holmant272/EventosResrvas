package co.edu.ue.repository;

import java.util.List;

import co.edu.ue.Entity.Reservacion;


public interface IReservacionRepository {

	
	Object findById(int id);

	List<Reservacion> findAll();
	
	Reservacion save(Reservacion Reservacion);

	Reservacion update(Reservacion Reservacion);

	void delete(int id);
}
