package com.seshu.springboot.cruddemo.rest;

import com.seshu.springboot.cruddemo.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> excHandler(Exception exc){
        EmployeeErrorResponse error = new EmployeeErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        System.out.println(exc.getMessage());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());


        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);

    }
}
