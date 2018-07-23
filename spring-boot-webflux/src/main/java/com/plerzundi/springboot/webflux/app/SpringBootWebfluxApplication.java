package com.plerzundi.springboot.webflux.app;

import com.plerzundi.springboot.webflux.app.models.dao.IProductoDao;
import com.plerzundi.springboot.webflux.app.models.documents.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringBootWebfluxApplication implements CommandLineRunner {

   @Autowired
    private IProductoDao dao;

    private static final Logger log = LoggerFactory.getLogger(SpringBootWebfluxApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebfluxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Flux.just( new Producto("TV Plasma", 250.99),
                new Producto("Notebook Sony", 500.80)

        )
                .flatMap( producto -> dao.save(producto))
                .subscribe( producto -> log.info("Insert: "+producto.getId()+" "+producto.getNombre()));
    }
}
