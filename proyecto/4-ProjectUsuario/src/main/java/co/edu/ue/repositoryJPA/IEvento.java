package co.edu.ue.repositoryJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.Entity.Evento;

public interface IEvento extends JpaRepository<Evento, Integer> {


}
