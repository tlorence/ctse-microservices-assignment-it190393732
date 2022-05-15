package com.productservice.sellingapp.ProductService.service;

import com.productservice.sellingapp.ProductService.entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product addProduct(Product product);
}
