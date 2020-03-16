package com.robert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robert.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacionCli(String identificacionCli);
	
}
