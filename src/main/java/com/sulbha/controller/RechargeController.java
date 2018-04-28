package com.sulbha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RechargeController {

	@RequestMapping("/hello")
	public String helloWorld() {
		String message = "hello welcome to recharge service";
		return message;
	}
}
