package com.explorecode.funwithapis.entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

    HttpStatus statusCode;
    String message;
}
