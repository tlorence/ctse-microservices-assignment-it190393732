package com.productservice.sellingapp.ProductService.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "product")
public class Product {
    int productId;
    String productName;
    String productDescription;
    int productQuantity;
}
