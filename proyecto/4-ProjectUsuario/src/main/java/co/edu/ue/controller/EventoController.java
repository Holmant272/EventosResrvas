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

import co.edu.ue.Entity.Evento;
import co.edu.ue.service.IEventoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("api/eventos")
public class EventoController {

	@Autowired
    private IEventoService Service;

    @GetMapping
    public List<Evento> getAllEventos() {
        return Service.findAll();
    }
    
    @GetMapping("/{id}")
	public Evento getEventoById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return Service.findById(id);
	}
    
    @PostMapping
    public Evento create(@RequestBody Evento evento){
        return Service.insert(evento);
    }


    @PutMapping("/{id}")
    public Evento update(@RequestBody Evento evento){
        return Service.update(evento);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
    	Service.delete(id);
    }
}
