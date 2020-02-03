package com.baina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.baina.model.Employee;
import com.baina.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService service;
	
	@GetMapping("/employee/{process}")
	public List<Employee> getEmployee(@PathVariable String process) {
		return service.getEmployee(process);
	}
	
}
