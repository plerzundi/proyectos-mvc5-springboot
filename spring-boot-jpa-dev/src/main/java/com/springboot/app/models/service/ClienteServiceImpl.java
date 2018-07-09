package com.springboot.app.models.service;

import com.springboot.app.models.dao.IClienteDao;
import com.springboot.app.models.dao.IProductoDao;
import com.springboot.app.models.entity.Cliente;
import com.springboot.app.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Revisado
 * */

@Service
public class ClienteServiceImpl implements IClienteService {


    @Autowired
    private IClienteDao clienteDao;
    @Autowired
    private IProductoDao productoDao;


    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDao.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Long id) {
        return clienteDao.findOne(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.delete(id);

    }

    @Override
    public List<Producto> findByNombre(String term) {
        return productoDao.findByNombreLikeIgnoreCase("%"+term+"%");
    }
}


