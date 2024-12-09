package co.edu.ue.repositoryJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.Entity.Reservacion;

public interface IReservacion extends JpaRepository<Reservacion, Integer> {

}
