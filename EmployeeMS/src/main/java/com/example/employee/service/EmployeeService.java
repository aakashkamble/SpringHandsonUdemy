package com.example.employee.service;

import com.example.employee.dto.APIResponseDto;
import com.example.employee.dto.EmployeeDto;

public interface EmployeeService {
	
	 EmployeeDto saveEmployee(EmployeeDto employeeDto);

	 APIResponseDto getEmpployeeById(Long employeeId);
	 //APIResponseDto getEmployeeById(Long employeeId);
}
