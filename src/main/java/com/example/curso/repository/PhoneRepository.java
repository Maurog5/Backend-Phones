package com.example.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.models.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
