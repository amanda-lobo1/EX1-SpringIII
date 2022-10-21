package com.mercadolivre.dh.covid19.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

public class HandlerException {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDetails> handlerBadRequestException(BadRequestException e){
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("Solicitação inválida!")
                .message(e.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }
}
