package com.poseidon.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MultiBoardController {

	@GetMapping("/about")
	public String index() {
		return "about";
	}
}