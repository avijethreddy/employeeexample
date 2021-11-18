package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee) throws Exception;
	
	
	public Employee searchEmployeeById(int employeeId) throws Exception;
	
	public List<Employee> getAllEmployees() throws Exception;
	
}
