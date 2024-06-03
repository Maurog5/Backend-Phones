package com.example.curso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table (name = "phones")
public class Phone implements Serializable {
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id  ; 
	
	private String nombre  ; 
	private String tipo  ; 
	private String data  ; 
	private String modelo  ; 
	
	@ManyToOne
	@JoinColumn (name= "id_pais")
	private Pais pais;
	
	@ManyToOne
	@JoinColumn (name= "id_estado")
	private Estado  estado ;

	
	
}
