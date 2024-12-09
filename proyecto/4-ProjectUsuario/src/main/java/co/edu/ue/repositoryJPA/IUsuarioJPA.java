package co.edu.ue.repositoryJPA;


import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ue.Entity.Usuario;

public interface IUsuarioJPA extends JpaRepository<Usuario, Integer> {
	
    Usuario findByEmail(String email); // Método personalizado si es necesario

	
}
