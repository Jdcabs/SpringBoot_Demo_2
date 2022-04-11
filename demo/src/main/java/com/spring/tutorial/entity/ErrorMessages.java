package com.spring.tutorial.entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ErrorMessages {
    
    private final HttpStatus httpStatus;
    private final String errorMessage;
}
