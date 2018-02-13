package com.spring.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.models.dao.IJugadorDao;
import com.spring.models.dao.IPaisDao;
import com.spring.models.entity.Jugador;
import com.spring.models.entity.Pais;

@Service
public class JugadorServiceImpl implements IJugadorService{
	
	@Autowired
	IJugadorDao jugadorDao;
	
	@Autowired
	IPaisDao paisDao;
	
	@Override
	public Jugador getJugador(String nombre) {
		return jugadorDao.findByNombre(nombre);
	}

	@Override
	public List<Jugador> getJugadores(Long idPais) {
		Optional<Pais> optional = paisDao.findById(idPais);
		Pais pais = optional.get();
		return jugadorDao.findByPais(pais);
	}

	@Override
	public List<Jugador> getJugadoresPais(String nombre) {
		Pais pais = paisDao.findByNombre(nombre);
		return jugadorDao.findByPais(pais);
	}

}
