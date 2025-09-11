package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to world"); // Model Data in key value pair
		mav.setViewName("index"); // View name
		
		return mav;
		
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMasg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Good Evening");
		mav.setViewName("index");
		
		return mav;	
		
	}
	
	//http://localhost:8080/msg?name=mangesh
	
	@GetMapping("/msg")
	public ModelAndView getMsg(@RequestParam("name") String usrname) {
		
		String msgText = usrname + " Good Morning !";
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", msgText);
		mav.setViewName("index");
		
		return mav;
	}
	

	//http://localhost:8080/book?name=spring&author=johnson
	@GetMapping("/book")
	public ModelAndView getBookData(@RequestParam("name") String bookName, String authorName) {
		
		String msgText = "bookName= "+ bookName+ "  Author Name = "+authorName;
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", msgText);
		mav.setViewName("index");
		
		return mav;
	}
	

}
