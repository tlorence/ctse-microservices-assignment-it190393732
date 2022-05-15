package com.productservice.sellingapp.ProductService.service.impl;

import com.productservice.sellingapp.ProductService.entity.Product;
import com.productservice.sellingapp.ProductService.repositories.ProductRepository;
import com.productservice.sellingapp.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
