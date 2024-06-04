package com.example.curso.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name="store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private String name;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Product> products;




}
