package com.productservice.sellingapp.ProductService.controller;

import com.productservice.sellingapp.ProductService.entity.Product;
import com.productservice.sellingapp.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/productService")
public class ProductServiceController {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
      return productService.addProduct(product);
    }

    @GetMapping("/get")
    public String getData(){
        return "Hey Sis";
    }
}
