package br.senai.exercicios.exceptions;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

@RestControllerAdvice
public class Handler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> trataErro404EntityNotFound() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> trataErro400BadRequest() {
        return ResponseEntity.badRequest().build();
    }

    @ExceptionHandler(HttpServerErrorException.InternalServerError.class)
    public ResponseEntity<String> trataErro500InternalServerError() {
        return ResponseEntity.badRequest().build();
    }

}
