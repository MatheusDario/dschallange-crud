package com.devsuperior.dschallenge.resouces;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dschallenge.entities.Client;

@RestController
@RequestMapping(value ="/clients")
public class ClientResouce {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Matheus Dario", "003.002.001-34", 2000.0, Instant.now(), 1));
		list.add(new Client(2L, "Bianca Maria", "001.002.003-30", 2000.0, Instant.now(), 1));
		return ResponseEntity.ok().body(list);
	}

}
