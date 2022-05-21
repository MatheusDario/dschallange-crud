package com.devsuperior.dschallenge.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dschallenge.dto.ClientDTO;
import com.devsuperior.dschallenge.entities.Client;
import com.devsuperior.dschallenge.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();	
		return list.stream().map(cls -> new ClientDTO(cls)).collect(Collectors.toList());
	}
}
