package com.employeeapp.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Employee;



@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	private Map<Integer, Employee> employeeData;
	
	@PostConstruct
	public void init() {
		
		employeeData=new HashMap<>();
		Employee emp1=new Employee(1001, "Rahul", LocalDate.of(1992, 5,10), "rahul@yahoo.com");
		Employee emp2=new Employee(1002, "Suraj", LocalDate.of(1995, 11,10), "suraj@yahoo.com");
		Employee emp3=new Employee(1003, "Rohit", LocalDate.of(1993, 10,15), "rohit@yahoo.com");
		
		employeeData.put(emp1.getEmployeeId(), emp1);
		employeeData.put(emp2.getEmployeeId(), emp2);
		employeeData.put(emp3.getEmployeeId(), emp3);
		
		
	}
	

	@Override
	public Employee saveEmployee(Employee employee) {
		
		employeeData.put(employee.getEmployeeId(),employee);
		
		return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeData.get(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		
		employeeData.remove(employeeId);
		
		return !employeeData.containsKey(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		employeeData.put(employee.getEmployeeId(),employee);
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return new ArrayList<>(employeeData.values());
	}
	
	

}
