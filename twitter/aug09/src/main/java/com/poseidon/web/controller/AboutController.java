package com.poseidon.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

	@GetMapping("/multiboard")
	public String index() {
		return "multiboard";
	}
}
