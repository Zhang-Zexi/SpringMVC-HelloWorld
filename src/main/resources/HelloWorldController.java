package com.yiibai.springmvc;

import org.springframework.ui.Model;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello(Model model){
		model.addAttribute("greeting","Hello Spring MVC");
		return "helloworld";
	}

}
