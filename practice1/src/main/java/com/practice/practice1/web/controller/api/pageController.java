package com.practice.practice1.web.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class pageController {


	@GetMapping("/index")
	public String main() {
		return "main";
	}
	
	@GetMapping("/data")
	@ResponseBody
	public String main2() {
		return "hi";
	}
}
