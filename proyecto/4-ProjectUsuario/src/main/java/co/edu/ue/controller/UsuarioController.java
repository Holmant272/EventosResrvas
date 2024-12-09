package co.edu.ue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.ue.Entity.Usuario;
import co.edu.ue.service.IUsuarioService;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController implements IUsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @Override
    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.findAll();
    }
    
    @Override
    @GetMapping("/{id}")
	public Usuario getUsuarioById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return usuarioService.findById(id);
	}
    
	@Override
	public ResponseEntity<Usuario> createUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Usuario> updateUsuario(Long id, Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
