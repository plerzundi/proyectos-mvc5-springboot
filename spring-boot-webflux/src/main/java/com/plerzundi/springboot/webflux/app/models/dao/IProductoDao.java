package com.plerzundi.springboot.webflux.app.models.dao;

import com.plerzundi.springboot.webflux.app.models.documents.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProductoDao extends ReactiveMongoRepository<Producto, String> {
}
