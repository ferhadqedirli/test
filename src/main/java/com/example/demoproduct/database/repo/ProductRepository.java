package com.example.demoproduct.database.repo;

import com.example.demoproduct.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
