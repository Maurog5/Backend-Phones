package com.example.curso.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.curso.models.Estado;
import com.example.curso.repository.EstadoRepository;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    public List<Estado> findAllByCountry(Long countryId) {

        if (countryId == null || countryId <= 0) {
            throw new IllegalArgumentException("countryId must be a positive long value");
        }

        return estadoRepository.findAll().stream()
                .filter(estado -> Objects.equals(estado.getPais().getId(), countryId))
                .collect(Collectors.toList());
    }
}