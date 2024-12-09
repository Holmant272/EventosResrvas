package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.Entity.Descuento;
import co.edu.ue.repositoryJPA.IDescuentoJPA;
import jakarta.persistence.EntityNotFoundException;


@Repository
public class DescuentoRepository implements IDescuentoRepository{

	
	@Autowired
    IDescuentoJPA descuentoJPA;

	@Override
	public Descuento findById(int id) {
		// TODO Auto-generated method stub
		return descuentoJPA.findById(id).orElse(null);
	}

	@Override
	public List<Descuento> findAll() {
		// TODO Auto-generated method stub
		return descuentoJPA.findAll();
	}

	@Override
	public Descuento save(Descuento Descuento) {
		return descuentoJPA.save(Descuento);
	}
	
	@Override
	public Descuento update(Descuento Descuento) {
		if (descuentoJPA.existsById(Descuento.getId())) {
            return descuentoJPA.save(Descuento);
        } else {
            throw new EntityNotFoundException("Evento no encontrado con ID: " + Descuento.getId());
        }
	}

	@Override
	public void delete(int id) {
		if (descuentoJPA.existsById(id)) {
			descuentoJPA.deleteById(id);
        } else {
            throw new EntityNotFoundException("Evento no encontrado con ID: " + id);
        }
	}
}
