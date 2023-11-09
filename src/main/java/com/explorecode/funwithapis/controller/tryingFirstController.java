package com.explorecode.funwithapis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tryingFirstController {
    
    @GetMapping("/") 
    public String firstendpoint() {
        return "These are grocery api endpoinds. \n EndPoints are : \n -> GET PRODUCTS : /getProducts \n -> GET PRDOUCT BY NAME : /getProduct/name/{name_of_the_product} \n -> DELETE PRODUCT BY ID : deleteProduct/{product_id} \n"
        + " -> GET PRODUCT BY ID : /getProduct/{product_id} \n "
        + " -> CREATE PRODUCT : /addProduct \n "
        + " -> ADD MULTIPLE PRODUCTS : /addMultipleProducts";
    }
}
