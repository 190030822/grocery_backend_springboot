package com.explorecode.funwithapis.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.explorecode.funwithapis.entity.Product;
import com.explorecode.funwithapis.error.ProductNotFoundException;
import com.explorecode.funwithapis.repository.ProductRepository;

import jakarta.validation.Valid;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        System.out.println("dfgdhtfjf");
        return productRepository.save(product);  
    }

    @Override
    public List<Product> fetchProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product fetchProductById(int productId) throws ProductNotFoundException {
        Optional<Product> product = productRepository.findById(productId);
        if (!product.isPresent()) {
            throw new ProductNotFoundException("Product Not Found");
        } else {
            return product.get();
        }
    }

    @Override
    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product updateProductById(int productId, Product product) {
        Product updateProduct = productRepository.findById(productId).get();
        
        if (Objects.nonNull(product.getName()) && !"".equalsIgnoreCase(product.getName())) {
            updateProduct.setName(product.getName());
        }
        if (Objects.nonNull(product.getDescription()) && !"".equalsIgnoreCase(product.getDescription())) {
            updateProduct.setDescription(product.getDescription());
        }
        if (Objects.nonNull(product.getImageUrl()) && !"".equalsIgnoreCase(product.getImageUrl())) {
            updateProduct.setImageUrl(product.getImageUrl());
        }
        if (Objects.nonNull(product.getPrice())) {
            updateProduct.setPrice(product.getPrice());
        }
        if (Objects.nonNull(product.getInStockCount())) {
            updateProduct.setInStockCount(product.getInStockCount()); 
        }
        return productRepository.save(updateProduct);
    }

    @Override
    public Product getProductByName(String productName) {
        return productRepository.findByNameIgnoreCase(productName);
    }

    @Override
    public List<Product> saveAllProducts(@Valid List<Product> products) {
        return productRepository.saveAll(products);
    }
    
}
