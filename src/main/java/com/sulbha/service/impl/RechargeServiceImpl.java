package com.sulbha.service.impl;

import org.springframework.stereotype.Service;

import com.sulbha.dto.RechargeRequestDTO;
import com.sulbha.dto.RechargeResponseDTO;
import com.sulbha.service.RechargeService;

@Service
public class RechargeServiceImpl implements RechargeService {

	@Override
	public RechargeResponseDTO save(RechargeRequestDTO rechargeRequestDTO) {
		RechargeResponseDTO rechargeResponseDTO = new RechargeResponseDTO();
		System.out.println("rechargeRequestDto :" + rechargeRequestDTO);
		
		rechargeResponseDTO.setAmount(rechargeRequestDTO.getAmount());
		rechargeResponseDTO.setOperator(rechargeRequestDTO.getOperator());
		
		return rechargeResponseDTO;
	}

}
