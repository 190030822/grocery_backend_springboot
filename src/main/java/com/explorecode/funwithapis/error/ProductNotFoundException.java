package com.explorecode.funwithapis.error;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(String errMsg) {
        super(errMsg);
     }
}