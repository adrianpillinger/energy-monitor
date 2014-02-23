/**
 * 
 */
package com.energy.monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This example Spring MVC controller is simply here to demonstrate the spring
 * MVC controller setup.
 * 
 * @author adrian
 * 
 */
@Controller
public class ExampleController {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

}
