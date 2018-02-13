package com.spring.models.services;

import java.util.List;

import com.spring.models.entity.Jugador;

public interface IJugadorService {
	Jugador getJugador(String nombre);
	List<Jugador> getJugadores(Long idPais);
	List<Jugador> getJugadoresPais(String nombre);
}
