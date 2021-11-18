package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestApiController {
	
	@Autowired
	EmployeeService service;

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") int employeeId) {
		
		Employee employee=null;
		
		try {
			employee= service.searchEmployeeById(employeeId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employee;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		List<Employee> employees=null;
		
		try {
			employees = service.getAllEmployees();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees;
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		try {
			return service.addEmployee(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@DeleteMapping("/employees/{id}")
	public boolean deleteEmployeeById(@PathVariable("id") int employeeId) {
		
		
		
		return true;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return null;
	}
	
}
