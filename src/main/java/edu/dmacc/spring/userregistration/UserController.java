package edu.dmacc.spring.userregistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	private static final String[] countries = {"Kenya", "United States", "Germany", "Vietnam"};
	
	@RequestMapping(value = "/form")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userForm");
		modelAndView.addObject("user", new User());
		modelAndView.addObject("countries", countries);
		
		return modelAndView;
	}
	
/*	@RequestMapping(value = "/result")
	public ModelAndView processUser(User user) {
		System.out.println("In processUser");
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Value in getName " + user.getName());
		modelAndView.setViewName("userResult");
		modelAndView.addObject("u", user);
		return modelAndView;
	}
*/}
