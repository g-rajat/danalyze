package com.danalyze.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/danalyze")
public class DanalyzeRestController {

	
	@GetMapping("/info")
	public String getInfo() {
		return "Server Info: OK";
	}
	
}
