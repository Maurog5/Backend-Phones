package com.example.curso.service;

import com.example.curso.models.Store;
import com.example.curso.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    public Store addStore(Store store) {
        return storeRepository.save(store);
    }
}