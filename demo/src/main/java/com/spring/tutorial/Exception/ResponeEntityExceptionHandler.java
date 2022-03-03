package com.spring.tutorial.Exception;

import com.spring.tutorial.entity.ErrorMessages;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class ResponeEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentIdNotFound.class)
    public ResponseEntity<ErrorMessages> DepartmentIdNotFound(DepartmentIdNotFound departmentIdNotFound, WebRequest webRequest) {

        ErrorMessages errorMessages = new ErrorMessages(HttpStatus.NOT_FOUND, departmentIdNotFound.getMessage());

        return ResponseEntity.status(errorMessages.getHttpStatus()).body(errorMessages);
    }

    @ExceptionHandler(DepartmentNotFound.class)
    public ResponseEntity<ErrorMessages> departmentNotFound(DepartmentNotFound departmentNotFound, WebRequest webRequest) {

        ErrorMessages errorMessages = new ErrorMessages(HttpStatus.OK, departmentNotFound.getMessage());

        return ResponseEntity.status(errorMessages.getHttpStatus()).body(errorMessages);
    }
}
