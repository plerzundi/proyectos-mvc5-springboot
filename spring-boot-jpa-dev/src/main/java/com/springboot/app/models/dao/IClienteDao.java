package com.springboot.app.models.dao;

import com.springboot.app.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Listo y revisado
 * */

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {
}
