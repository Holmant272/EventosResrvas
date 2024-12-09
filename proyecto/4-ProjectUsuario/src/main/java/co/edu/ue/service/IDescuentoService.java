package co.edu.ue.service;

import java.util.List;

import co.edu.ue.Entity.Descuento;

public interface IDescuentoService {

	List<Descuento> findAll();

	Descuento findById(int id);

	Descuento insert(Descuento Descuento);
	Descuento update(Descuento Descuento);

	void delete(int id);

}
