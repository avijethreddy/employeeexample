package com.employeeapp.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/search")
	public String searchEmployee(@RequestParam("idtxt") int employeeId, Model model) {
		try {
			Employee employee = service.searchEmployeeById(employeeId);
			
			model.addAttribute("employee", employee);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "show-employee.jsp";
		
		
	}
	
//	@GetMapping("/search")
//	@ResponseBody
//	public Employee searchEmployee(@RequestParam("idtxt") int employeeId, Model model) {
//		
//		Employee employee=null;
//		try {
//			employee = service.searchEmployeeById(employeeId);
//			
//			model.addAttribute("employee", employee);
//			
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return employee;
//		
//		
//	}
	
	
//	@PostMapping("/addemployee")
//	public String addEmployee(@RequestParam("idtxt") int employeeId,
//			@RequestParam("nametxt") String employeeName,
//			@RequestParam("emailtxt") String email,
//			@DateTimeFormat(pattern = "yyyy-MM-dd")
//			@RequestParam("dobtxt") LocalDate dob,
//			Model model) {
//		
//		Employee employee = new Employee(employeeId, employeeName, dob, email);
//		try {
//			service.addEmployee(employee);
//			model.addAttribute("employee", employee);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return "show-employee.jsp";
//
//	}
	
	@PostMapping("/addemployee")
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		
		try {
			service.addEmployee(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "show-employee.jsp";
	}

}
