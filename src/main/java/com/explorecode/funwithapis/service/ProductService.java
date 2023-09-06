package com.explorecode.funwithapis.service;
import java.util.List;

import com.explorecode.funwithapis.entity.Product;
import com.explorecode.funwithapis.error.ProductNotFoundException;

import jakarta.validation.Valid;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> fetchProducts();

    Product fetchProductById(int productId) throws ProductNotFoundException;

    void deleteProductById(int productId);

    Product updateProductById(int productId, Product product);

    Product getProductByName(String productName);

    List<Product> saveAllProducts(@Valid List<Product> products);

}
