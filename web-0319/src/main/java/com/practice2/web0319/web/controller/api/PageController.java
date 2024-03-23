package com.practice2.web0319.web.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
	
	@ResponseBody
	@GetMapping("/index")
	public String index() {
		return "hi";
	}
}
