package co.edu.ue.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.ue.Entity.Usuario;

import java.util.List;

public interface IUsuarioController {

    @GetMapping
    List<Usuario> getAllUsuarios();

    @PostMapping
    ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario);

    @PutMapping("/{id}")
    ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteUsuario(@PathVariable Long id);

	Usuario getUsuarioById(int id);
}
