package com.explorecode.funwithapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.explorecode.funwithapis.entity.Product;
import com.explorecode.funwithapis.error.ProductNotFoundException;
import com.explorecode.funwithapis.service.ProductService;

import jakarta.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct") 
    public Product saveProduct(@Valid @RequestBody Product product) {
        return productService.saveProduct(product);
    }
    
    @PostMapping("/addMultipleProducts") 
    public List<Product> saveProducts(@Valid @RequestBody List<Product> products) {
        return productService.saveAllProducts(products);
    }

    @GetMapping("/getProducts") 
    public List<Product> getProducts() {
        return productService.fetchProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProductById(@PathVariable("id") int productId) throws ProductNotFoundException {
        return productService.fetchProductById(productId);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProductById(@PathVariable("id") int productId) {
        productService.deleteProductById(productId);
    }

    @PutMapping("/updateProduct/{id}") 
    public Product updateProductById(@PathVariable("id") int productId, @RequestBody Product product) {
        return productService.updateProductById(productId, product);
    }

    @GetMapping("/getProduct/name/{name}")
    public Product getProductByName(@PathVariable("name") String productName) {
        return productService.getProductByName(productName);
    }
}
