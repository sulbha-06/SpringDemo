package com.sulbha.service;

import com.sulbha.dto.RechargeRequestDTO;
import com.sulbha.dto.RechargeResponseDTO;

public interface RechargeService {
	public RechargeResponseDTO save(RechargeRequestDTO rechargeRequestDTO);

}
