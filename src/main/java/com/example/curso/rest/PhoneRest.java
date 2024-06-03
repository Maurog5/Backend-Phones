package com.example.curso.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.models.Phone;
import com.example.curso.service.PhoneService;

@RestController
@RequestMapping("/phones")
public class PhoneRest {

	@Autowired
	private PhoneService phoneService;

	@GetMapping
	public ResponseEntity<List<Phone>> getAllPersonas() {
		return ResponseEntity.ok(phoneService.findAll());
	}

	@PostMapping
	public ResponseEntity<Phone> savePhone(@RequestBody Phone phone) {
		System.out.println("asdasdas");
		try {
			Phone phoneGuardado = phoneService.save(phone);
			return ResponseEntity.created(new URI("/phones/" + phoneGuardado.getId())).body(phoneGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	public ResponseEntity<Boolean> deletePhone(@PathVariable("id") Long id) {
	    try {
	        phoneService.deleteById(id);
	        boolean exists = phoneService.findById(id) != null;
	        return ResponseEntity.ok(!exists);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
	    }
	}

}
