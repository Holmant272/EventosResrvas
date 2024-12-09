package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.Entity.Reservacion;
import co.edu.ue.repositoryJPA.IReservacion;
import jakarta.persistence.EntityNotFoundException;

@Repository
public class ReservacionRepository implements IReservacionRepository{

	
	@Autowired
    IReservacion JPA;

	@Override
	public Reservacion findById(int id) {
		return JPA.findById(id).orElse(null);
	}

	@Override
	public List<Reservacion> findAll() {
		return JPA.findAll();
	}

	@Override
	public Reservacion save(Reservacion Reservacion) {
		return JPA.save(Reservacion);
	}
	
	@Override
	public Reservacion update(Reservacion Reservacion) {
		if (JPA.existsById(Reservacion.getId())) {
            return JPA.save(Reservacion);
        } else {
            throw new EntityNotFoundException("Evento no encontrado con ID: " + Reservacion.getId());
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
