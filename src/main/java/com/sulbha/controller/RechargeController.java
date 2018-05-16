package com.sulbha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sulbha.dto.RechargeRequestDTO;
import com.sulbha.dto.RechargeResponseDTO;
import com.sulbha.service.impl.RechargeServiceImpl;

@RestController
public class RechargeController {

	@Autowired
	private RechargeServiceImpl rechargeServiceImpl;

	@RequestMapping("/hello")
	public String helloWorld() {
		String message = "hello welcome to recharge service";
		return message;
	}

	@RequestMapping(value = "/recharge", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RechargeResponseDTO airtelRecharge(@RequestBody RechargeRequestDTO rechargeRequestDTO) {
		return this.rechargeServiceImpl.save(rechargeRequestDTO);
	}

}
