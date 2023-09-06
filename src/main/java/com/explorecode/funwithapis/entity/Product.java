package com.explorecode.funwithapis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @NotBlank(message = "Product Name required")
  private String name;
  private String description;
  private double price;
  private String imageUrl;
  private int inStockCount;
  
}