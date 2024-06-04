package com.example.curso.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    // Otros atributos de producto, como descripción, cantidad en stock, etc.

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

}
