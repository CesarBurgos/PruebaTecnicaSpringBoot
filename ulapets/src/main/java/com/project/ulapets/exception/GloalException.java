package com.project.ulapets.exception;

import com.project.ulapets.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloalException {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> manejarError(Exception e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse<>(false, e.getMessage(), null));
    }
}
