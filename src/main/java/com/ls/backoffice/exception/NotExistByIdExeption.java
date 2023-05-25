package com.ls.backoffice.exception;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class NotExistByIdExeption extends RuntimeException{
    public NotExistByIdExeption(String message){
        super (message);
        log.error("Id not exist exceptions");
    }
}
