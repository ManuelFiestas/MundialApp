package com.spring.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.models.entity.Pais;

public interface IPaisDao extends JpaRepository<Pais, Long> {
	Pais findByNombre(String nombre );
}
