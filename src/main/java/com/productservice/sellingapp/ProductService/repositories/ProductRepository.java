package com.productservice.sellingapp.ProductService.repositories;

import com.productservice.sellingapp.ProductService.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
