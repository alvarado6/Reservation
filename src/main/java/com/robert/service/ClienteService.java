package com.robert.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.robert.entity.Cliente;
import com.robert.repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Transactional
	public Cliente createCliente(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	@Transactional
	public Cliente updateCliente(Cliente cliente){
		return this.clienteRepository.save(cliente);
	}	
	
	@Transactional
	public void deleteCliente(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	public Cliente findByIdentificacionCli(String identificacionCli) {
		return this.clienteRepository.findByIdentificacionCli(identificacionCli);
	}
	
}
