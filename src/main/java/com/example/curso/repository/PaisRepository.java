package com.example.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.curso.models.Pais;


public interface PaisRepository extends JpaRepository<Pais, Long> {
}