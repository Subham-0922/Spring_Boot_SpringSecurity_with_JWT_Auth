package com.login.exception;

import java.time.LocalDateTime;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyExceptionDetails> exceptionHandler5(UserException ce, WebRequest req) {
		MyExceptionDetails err = new MyExceptionDetails();
		err.setTimpstamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyExceptionDetails> exceptionHandler5(AdminException ce, WebRequest req) {
		MyExceptionDetails err = new MyExceptionDetails();
		err.setTimpstamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyExceptionDetails> exceptionHandler(NoHandlerFoundException ce, WebRequest req) {
		MyExceptionDetails err = new MyExceptionDetails();
		err.setTimpstamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyExceptionDetails> exceptionHandler2(MethodArgumentNotValidException ce, WebRequest req) {
		MyExceptionDetails err = new MyExceptionDetails();
		err.setTimpstamp(LocalDateTime.now());
		err.setMessage(ce.getBindingResult().getFieldError().getDefaultMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<MyExceptionDetails> exceptionHandler3(NotFoundException ce, WebRequest req) {
		MyExceptionDetails err = new MyExceptionDetails();
		err.setTimpstamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyExceptionDetails> exceptionHandler1(Exception ce, WebRequest req) {
		MyExceptionDetails err = new MyExceptionDetails();
		err.setTimpstamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(req.getDescription(false));

		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

}