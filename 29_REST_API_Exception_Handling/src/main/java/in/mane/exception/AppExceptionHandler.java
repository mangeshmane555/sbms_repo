package in.mane.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//@ControllerAdvice for normal web app called local exception handler
//@RestControllerAdvice for Global exception handler

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleCnfe(CustomerNotFoundException cnfe){
		
		ExceptionInfo info = new ExceptionInfo();
		info.setCode("EX0011");
		info.setMsg(cnfe.getMessage());
		info.setDate(LocalDateTime.now());
		
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
		
	}

}
