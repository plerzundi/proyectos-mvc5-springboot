package com.springboot.app;

import com.springboot.app.models.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringbootJpaApplication  implements CommandLineRunner {

    @Autowired
    IUploadFileService uploadFileService;

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringbootJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        uploadFileService.deleteAll();
        uploadFileService.init();
    }
}
