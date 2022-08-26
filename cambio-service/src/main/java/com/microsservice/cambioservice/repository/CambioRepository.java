package com.microsservice.cambioservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservice.cambioservice.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
    
    Cambio findByFromAndTo(String from, String to);
}
