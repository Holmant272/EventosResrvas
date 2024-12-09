package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.Entity.Reservacion;
import co.edu.ue.service.IReservacionService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/reservaciones")
public class ReservacionController {

	
	@Autowired
    private IReservacionService Service;

    @GetMapping
    public List<Reservacion> getAllEventos() {
        return Service.findAll();
    }
    
    @GetMapping("/{id}")
	public Reservacion getEventoById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return Service.findById(id);
	}
    
    @PostMapping
    public Reservacion create(@RequestBody Reservacion Reservacion){
        return Service.insert(Reservacion);
    }


    @PutMapping("/{id}")
    public Reservacion update(@RequestBody Reservacion Reservacion){
        return Service.update(Reservacion);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
    	Service.delete(id);
    }
}
