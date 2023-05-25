package com.ls.backoffice.controller;

import com.ls.backoffice.exception.MissingRequiredFieldException;
import com.ls.backoffice.exception.NotExistByIdExeption;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ResponseBody
@ControllerAdvice
public class GlobalControllerAdvice {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MissingRequiredFieldException.class)
    public Map<String, String> handlerValidationException(MissingRequiredFieldException ex) {
        Map<String, String> errors = new HashMap<>();
        String fieldName = String.format("Error: Missing %s",ex.getFieldName());
        errors.put(fieldName, ex.getMessage());
        return errors;
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NotExistByIdExeption.class)
    public String handlerIdNotFoundException(NotExistByIdExeption ex) {
        return ex.getMessage();
    }

}
