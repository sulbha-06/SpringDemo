package com.sulbha.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sulbha.data.model.EmployeeTransaction;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeTransaction, Long> {

	// @Query(value = "select * from employee_transaction",nativeQuery=true)
	// public List<EmployeeTransaction> fetchAllEmployee();

	public List<EmployeeTransaction> findAll();

}
