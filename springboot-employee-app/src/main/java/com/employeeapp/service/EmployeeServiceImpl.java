package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.EmployeeDao;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao dao;
	
	
	public EmployeeServiceImpl() {
	}
	
	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		
		return dao.saveEmployee(employee);
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws Exception {
		
		return dao.getEmployeeById(employeeId);
	}
	
	@Override
	public List<Employee> getAllEmployees() throws Exception {
		
		return dao.getAllEmployees();
	}

}
