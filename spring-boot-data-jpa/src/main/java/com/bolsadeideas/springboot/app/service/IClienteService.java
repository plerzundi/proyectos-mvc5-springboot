package com.bolsadeideas.springboot.app.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente>findAll();
	public void save(Cliente cliente);
	public void delete(Long id);
	public Cliente findOne(Long id);


}
