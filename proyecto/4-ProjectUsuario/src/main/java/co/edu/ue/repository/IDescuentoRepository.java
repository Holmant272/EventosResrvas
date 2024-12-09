package co.edu.ue.repository;

import java.util.List;

import co.edu.ue.Entity.Descuento;

public interface IDescuentoRepository {

	List<Descuento> findAll();

	Descuento save(Descuento descuento);

	Object findById(int id);


	Descuento update(Descuento descuento);

	void delete(int id);

}
