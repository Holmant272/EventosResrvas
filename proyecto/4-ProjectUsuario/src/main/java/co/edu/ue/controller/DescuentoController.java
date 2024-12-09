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

import co.edu.ue.Entity.Descuento;
import co.edu.ue.service.IDescuentoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("api/descuentos")
public class DescuentoController {

	
	@Autowired
    private IDescuentoService Service;

    @GetMapping
    public List<Descuento> getAllDescuentos() {
        return Service.findAll();
    }
    
    @GetMapping("/{id}")
	public Descuento getDescuentoById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return Service.findById(id);
	}
    
    @PostMapping
    public Descuento create(@RequestBody Descuento Descuento){
        return Service.insert(Descuento);
    }


    @PutMapping("/{id}")
    public Descuento update(@RequestBody Descuento Descuento){
        return Service.update(Descuento);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
    	Service.delete(id);
    }
}
