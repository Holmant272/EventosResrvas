package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.Entity.Descuento;
import co.edu.ue.repository.DescuentoRepository;


@Service
public class DescuentoService implements IDescuentoService{

	@Autowired
    private DescuentoRepository descuentoRepository;

    public List<Descuento> findAll() {
        return descuentoRepository.findAll();
    }

    public Descuento findById(int id) {
        return descuentoRepository.findById(id);
    }

    public Descuento insert(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }
    
    public Descuento update(Descuento Descuento) {
        return descuentoRepository.update(Descuento);
    }

	public void delete(int id) {
		descuentoRepository.delete(id);
	}

}
