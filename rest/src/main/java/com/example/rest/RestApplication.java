package com.example.rest;

import java.util.List;
import java.lang.Iterable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/personas")
@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	
	@Autowired
	private Ipersona repo;
	@GetMapping
	public Iterable<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona per){
		repo.save(per);
	}

	@PutMapping
	public void modificar(@RequestBody Persona per){
		repo.save(per);
	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		repo.deleteById(id);
	}
}
