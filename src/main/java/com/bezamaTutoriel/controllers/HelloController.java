package com.bezamaTutoriel.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
@Controller
public class HelloController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
