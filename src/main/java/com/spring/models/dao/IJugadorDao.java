package com.spring.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.models.entity.Jugador;
import com.spring.models.entity.Pais;

public interface IJugadorDao extends JpaRepository<Jugador, Long> {
	
	Jugador findByNombre(String nombre);
	List<Jugador> findByPais(Pais pais);
}
