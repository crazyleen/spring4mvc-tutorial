package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}


	/**
	 * 
	 * @param model ModelMap is a Map implementation, which saves you from old 
	 * request.getAttribute/request.setAttribute. It provides a way 
	 * to set/get attributes from/to request or session.
	 * @return
	 */
	@RequestMapping(value="/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		String fuck = (String) model.get("fuck");
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC ## " + fuck);
		return "welcome";
	}

}
