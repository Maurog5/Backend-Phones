package com.example.curso.rest;

import com.example.curso.models.Pais;
import com.example.curso.models.Store;
import com.example.curso.service.StoreService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@RestController
@RequestMapping("/stores")
public class StoreRestController {
    @Autowired
    private StoreService storeService;

    @GetMapping
    public ResponseEntity <List<Store>> getAllStores() {
        return ResponseEntity.ok(storeService.getAllStores());
    }

    @PostMapping
    public ResponseEntity<Store> addStore(@RequestBody Store store) {
        Store newStore = storeService.addStore(store);
        return new ResponseEntity<>(newStore, HttpStatus.CREATED);
    }

}