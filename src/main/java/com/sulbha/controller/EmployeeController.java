package com.sulbha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sulbha.data.model.EmployeeTransaction;
import com.sulbha.dto.EmployeeRequestDTO;
import com.sulbha.dto.EmployeeResponseDTO;
import com.sulbha.service.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl rechargeServiceImpl;

	@RequestMapping("/hello")
	public String helloWorld() {
		String message = "hello welcome to recharge service";
		return message;
	}

	@RequestMapping(value = "/recharge", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponseDTO airtelRecharge(@RequestBody EmployeeRequestDTO rechargeRequestDTO) {
		return this.rechargeServiceImpl.save(rechargeRequestDTO);
	}
	
	@RequestMapping(value = "/fetchAll", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeTransaction> fetchEmployee() {
		return this.rechargeServiceImpl.fetch();
	}
	
	
}
