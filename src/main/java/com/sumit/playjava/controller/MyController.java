package com.sumit.playjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping ("/test-docker")
	public String getData () {
		return "in docker project of play java " ;
	}

}
