package com.example.demoProject.college1;


import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        String message = ex.getMessage();
        
        if (message != null && message.contains("Data too long for column")) {
            String columnName = extractColumnName(message);
            System.out.println("Column Name of  exception is = " + columnName);
        }

        return new ResponseEntity<>("Data integrity violation: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    private String extractColumnName(String message) {
        String columnIdentifier = "Data too long for column '";
        int startIndex = message.indexOf(columnIdentifier) + columnIdentifier.length();
        int endIndex = message.indexOf("'", startIndex);
        return message.substring(startIndex, endIndex);
    }
}
