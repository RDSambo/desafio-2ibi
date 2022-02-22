package com._2ibi.desafio.repository;

import com._2ibi.desafio.model.Pais;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    
}
