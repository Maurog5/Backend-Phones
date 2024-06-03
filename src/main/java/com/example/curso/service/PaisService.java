package com.example.curso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.curso.models.Pais;
import com.example.curso.repository.PaisRepository;

@Service
public class PaisService  {
	@Autowired
	private PaisRepository paisRepository;

	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

}
