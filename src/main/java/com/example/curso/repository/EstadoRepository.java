package com.example.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.curso.models.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
