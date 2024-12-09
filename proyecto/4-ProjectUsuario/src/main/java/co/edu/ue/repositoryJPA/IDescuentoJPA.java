package co.edu.ue.repositoryJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.Entity.Descuento;


public interface IDescuentoJPA extends JpaRepository<Descuento, Integer> {

}
