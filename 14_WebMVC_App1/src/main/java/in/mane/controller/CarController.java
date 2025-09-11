package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

	@GetMapping("/car/{carId}/hyd")
	public ModelAndView getCarColor(@PathVariable Integer carId) {
		
		String color = null;
		
		if (carId >=100) {
			color = "Red";
		}else {
			color = "Black";
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Car color is "+ color);
		mav.setViewName("index");
		return mav;
		
	}
	
	@GetMapping("/stock/{brand}/location/{loc}")
	public ModelAndView getCarStock(@PathVariable String brand, @PathVariable String loc) {
		
		String msgText = "brand = "+brand +"  location= "+ loc;
				
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgText);
		mav.setViewName("index");
		return mav;
		
	}
	
	
	
}
