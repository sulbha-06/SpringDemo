package com.sulbha.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sulbha.dto.RechargeRequestDTO;
import com.sulbha.dto.RechargeResponseDTO;

@RestController
public class RechargeController {
	
	
	
	@RequestMapping("/hello")
	public String helloWorld() {
		String message = "hello welcome to recharge service";
		return message;
	}
	
	@RequestMapping(value="/recharge",method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public RechargeResponseDTO airtelRecharge(@RequestBody RechargeRequestDTO rechargeRequestDto) {
		RechargeResponseDTO rechargeResponseDTO = new RechargeResponseDTO();
		System.out.println("rechargeRequestDto :" + rechargeRequestDto);
		
		//rechargeResponseDTO.setAmount(rechargeRequestDto.getAmount());
		//rechargeResponseDTO.setOperator(rechargeRequestDto.getOperator());
		return rechargeResponseDTO;
	}
}
