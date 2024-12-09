package co.edu.ue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.Entity.Usuario;
import co.edu.ue.repository.UsuarioRepository;  // Cambia esto de IUsuarioRepository a UsuarioRepository
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;  // Aquí inyectas la implementación concreta

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.ListUsuarios();
    }

    @Override
    public Usuario findById(int id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario insert(Usuario usuario) {
        return usuarioRepository.insertUsuario(usuario);
    }

	@Override
	public Usuario findById(Integer id) {
		return usuarioRepository.findById(id);
	}

}
