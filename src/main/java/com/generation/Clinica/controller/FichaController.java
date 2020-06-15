package com.generation.Clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.Clinica.model.FichaModel;
import com.generation.Clinica.repository.FichaRepository;


@RestController
@RequestMapping("/ficha")
@CrossOrigin("*")
public class FichaController {

	@Autowired
	private FichaRepository repository;
	
	@GetMapping("/{codFicha}")
	public ResponseEntity<FichaModel> GetById(@PathVariable long codFicha){ 
	  return repository.findById(codFicha)
			.map(resp->ResponseEntity.ok(resp))
	        .orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping
	public ResponseEntity<List<FichaModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<FichaModel> post(@RequestBody FichaModel Ficha){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Ficha));
	}
	//put 
	@PutMapping
	public ResponseEntity<FichaModel>
	put(@RequestBody FichaModel Ficha){
		return ResponseEntity.status(HttpStatus.OK).
				body(repository.save(Ficha));
	}
	//delete
	@DeleteMapping("/{codFicha}")
	public void delete(@PathVariable long codFicha) {
		repository.deleteById(codFicha);
	}
}
