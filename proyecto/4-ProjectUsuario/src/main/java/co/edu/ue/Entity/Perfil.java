package co.edu.ue.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfiles")
@NamedQuery(name = "Perfil.findAll", query = "SELECT h FROM Perfil h")
public class Perfil {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String perfil;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
    }
}
