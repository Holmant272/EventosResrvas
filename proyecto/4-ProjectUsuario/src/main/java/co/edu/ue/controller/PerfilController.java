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

import co.edu.ue.Entity.Perfil;
import co.edu.ue.service.IPerfilService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("api/perfiles")
public class PerfilController {

	
	@Autowired
    private IPerfilService Service;

    @GetMapping
    public List<Perfil> getAll() {
        return Service.findAll();
    }
    
    @GetMapping("/{id}")
	public Perfil getById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return Service.findById(id);
	}
    
    @PostMapping("/prueba")
    public Perfil create(@RequestBody Perfil perfil){
        return Service.insert(perfil);
    }


    @PutMapping("/{id}")
    public Perfil update(@RequestBody Perfil evento){
        return Service.update(evento);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
    	Service.delete(id);
    }
}
