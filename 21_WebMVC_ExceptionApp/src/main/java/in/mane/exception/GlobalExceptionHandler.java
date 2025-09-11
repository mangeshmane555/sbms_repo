package in.mane.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

//To make this controller globally returning view page
@ControllerAdvice 
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView HandleAE(Exception ae) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("problem");
		return mav;

	}
}


/*
 * // To make this Restcontroller globally returning custom message
@RestControllerAdvice 
public class GlobalExceptionHandler{
	
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		
		return "Problem occurred globally";
	
	}
}
*/


