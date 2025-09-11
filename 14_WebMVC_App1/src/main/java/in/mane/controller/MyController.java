package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
	// Approach 1 ModelAndView
	@GetMapping("/hii")
	public ModelAndView getHiiMsg(@RequestParam String name) {
		
		String msgText = "Welcome "+name;
				
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgText);
		mav.setViewName("index");
		return mav;
		
	}

	// Approach 2 Using Model (Recommended)
	@GetMapping("/hello")
	public String getHelloMsg(@RequestParam String name, Model model) {
		
		String msgText = "Welcome "+name;
		
		model.addAttribute("msg", msgText);
		return "index";
		
		
	}

}
