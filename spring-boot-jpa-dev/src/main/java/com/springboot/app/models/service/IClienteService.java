package com.springboot.app.models.service;

import com.springboot.app.models.entity.Cliente;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;


/**
 * Revisado
 * */

public interface IClienteService {

    public List<Cliente> findAll();

     public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);



}
