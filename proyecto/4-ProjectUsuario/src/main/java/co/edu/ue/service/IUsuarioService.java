package co.edu.ue.service;

import java.util.List;

import co.edu.ue.Entity.Usuario;

public interface IUsuarioService {

    List<Usuario> findAll();

    Usuario insert(Usuario usuario);

	Usuario findById(int id);

	Usuario findById(Integer id);
}
