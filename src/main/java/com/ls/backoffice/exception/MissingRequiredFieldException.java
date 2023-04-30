package com.ls.backoffice.exception;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class MissingRequiredFieldException extends RuntimeException {
    private String fieldName;

    public MissingRequiredFieldException(String message, String fieldName) {
        super(message);
        this.fieldName = fieldName;
        log.error(message);
    }
}
