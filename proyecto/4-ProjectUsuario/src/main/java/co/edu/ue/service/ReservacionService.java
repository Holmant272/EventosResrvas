package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.Entity.Reservacion;
import co.edu.ue.repository.ReservacionRepository;

@Service
public class ReservacionService implements IReservacionService{

	
	@Autowired
    private ReservacionRepository Repository;

    public List<Reservacion> findAll() {
        return Repository.findAll();
    }

    public Reservacion findById(int id) {
        return Repository.findById(id);
    }

    public Reservacion insert(Reservacion Reservacion) {
        return Repository.save(Reservacion);
    }
    
    public Reservacion update(Reservacion Reservacion) {
        return Repository.update(Reservacion);
    }

	public void delete(int id) {
		Repository.delete(id);
	}
}
