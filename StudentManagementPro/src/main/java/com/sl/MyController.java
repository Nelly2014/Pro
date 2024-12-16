package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/home")
	public String abc() {
		//Business Logic goes here
		
		
		return "home"; // go to /WEB-INF/views/home.jsp
	}
}
