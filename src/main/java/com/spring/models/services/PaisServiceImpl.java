package com.spring.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.models.dao.IPaisDao;
import com.spring.models.entity.Pais;

@Service
public class PaisServiceImpl implements IPaisService{
	
	
	//List<Pais> lista = new ArrayList<>();
	@Autowired
	private IPaisDao paisDao;

	@Override
	public List<Pais> getPaises() {
		return paisDao.findAll();
	}

}


// public PaisServiceImpl() {
//	Pais p1 = new Pais();
//	p1.setId(1L);
//	p1.setNombre("Argentina");
//	p1.setContinente("Sudamerica");
//	p1.setImagen("http://img.fifa.com/images/flags/3/arg.png");
//	
//	Pais p2 = new Pais();
//	p2.setId(1L);
//	p2.setNombre("Brasil");
//	p2.setContinente("Sudamerica");
//	p2.setImagen("http://img.fifa.com/images/flags/3/bra.png");
//	
//	Pais p3 = new Pais();
//	p3.setId(1L);
//	p3.setNombre("Colombia");
//	p3.setContinente("Sudamerica");
//	p3.setImagen("http://img.fifa.com/images/flags/3/col.png");
//	
//	Pais p4 = new Pais();
//	p4.setId(1L);
//	p4.setNombre("Perú");
//	p4.setContinente("Sudamerica");
//	p4.setImagen("http://img.fifa.com/images/flags/3/per.png");
//	
//	Pais p5 = new Pais();
//	p5.setId(1L);
//	p5.setNombre("Uruguay");
//	p5.setContinente("Sudamerica");
//	p5.setImagen("http://img.fifa.com/images/flags/3/uru.png");

	//lista.add(p1);
	//lista.add(p2);
	//lista.add(p3);
	//lista.add(p4);
	//lista.add(p5);
//}
