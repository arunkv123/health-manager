package com.healthmanager.doctor.rest;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.healthmanager.doctor.exception.DoctorNotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class SearchExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DoctorNotFoundException.class)
	public ResponseEntity<Object> handleCityNotFoundException(DoctorNotFoundException ex, WebRequest request) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", ex.getMessage());
		log.error("Doctor not found", ex);
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}
}
