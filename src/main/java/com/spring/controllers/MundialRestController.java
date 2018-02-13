package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.entity.Jugador;
import com.spring.models.entity.Pais;
import com.spring.models.services.IJugadorService;
import com.spring.models.services.IPaisService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MundialRestController {
	
	@Autowired
	IPaisService paisService;
	
	@Autowired
	IJugadorService jugadorService;
	
	@GetMapping("/paises")
	public List<Pais> getPaises() {
		return paisService.getPaises();
	}
	
	@GetMapping("/jugador/{nombre}")
	public Jugador getJugador(@PathVariable("nombre") String nombre) {
		return jugadorService.getJugador(nombre);
	}
	
	@GetMapping("/jugadores/{idPais}")
	public List<Jugador> getJugadores(@PathVariable("idPais") Long idPais) {
		return jugadorService.getJugadores(idPais);
	}
	
	@GetMapping("/seleccionados/{nombrePais}")
	public List<Jugador> getJugadoresPais(@PathVariable("nombrePais") String n) {
		return jugadorService.getJugadoresPais(n);
	}
}
