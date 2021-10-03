package com.example.demoproduct;

import com.example.demoproduct.database.repo.ProductRepository;
import com.example.demoproduct.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class DemoProductApplication implements CommandLineRunner {

    @Autowired ProductRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DemoProductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        repository.deleteById(6);
        Product product = repository.findById(4).get();
        product.setUnitsInStock(23.0);
        repository.save(product);
    }
}
