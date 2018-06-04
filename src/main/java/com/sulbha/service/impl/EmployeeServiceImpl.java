package com.sulbha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sulbha.data.model.EmployeeTransaction;
import com.sulbha.data.repository.EmployeeRepository;
import com.sulbha.dto.EmployeeRequestDTO;
import com.sulbha.dto.EmployeeResponseDTO;
import com.sulbha.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired EmployeeRepository employeeRepo;
	@Override
	public EmployeeResponseDTO save(EmployeeRequestDTO rechargeRequestDTO) {
		EmployeeTransaction employeeTransaction = new EmployeeTransaction();
		System.out.println("rechargeRequestDto :" + rechargeRequestDTO);
		
		employeeTransaction.setAge(rechargeRequestDTO.getAge());
		employeeTransaction.setEmployeeCode(rechargeRequestDTO.getEmployeeCode());
		employeeTransaction.setFirstName(rechargeRequestDTO.getFirstName());
		employeeTransaction.setLastName(rechargeRequestDTO.getLastName());
		employeeTransaction.setMobileNumber(rechargeRequestDTO.getMobileNumber());
		EmployeeTransaction emp = employeeRepo.save(employeeTransaction );
		if(emp == null){
			//data not saved exception
		}
		EmployeeResponseDTO resp = new EmployeeResponseDTO();
		resp.setEmployeeId(emp.getEmployeeId());
		return resp ;
	}

	public List<EmployeeTransaction> fetch() {
		List<EmployeeTransaction> emp =  employeeRepo.findAll() ;
//		 Iterator<String> itr = emp.iterator();
//	        while(itr.hasNext()){
//	            System.out.println(itr.next());
//	        }
		
		
		
		return emp;
	}
	
}
