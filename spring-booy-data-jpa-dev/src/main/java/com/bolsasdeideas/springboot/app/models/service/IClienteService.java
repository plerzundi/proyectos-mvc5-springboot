package com.bolsasdeideas.springboot.app.models.service;

import com.bolsasdeideas.springboot.app.models.entity.Cliente;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IClienteService {


    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);

}
