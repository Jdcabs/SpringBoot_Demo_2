package com.spring.tutorial.entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessages {
    
    private HttpStatus httpStatus;
    private String errorMessage;
}
