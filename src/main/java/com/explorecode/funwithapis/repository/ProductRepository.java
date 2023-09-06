package com.explorecode.funwithapis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.explorecode.funwithapis.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Product findByName(String productName);

    public Product findByNameIgnoreCase(String productName);
}
