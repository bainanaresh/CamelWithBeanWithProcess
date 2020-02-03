package com.baina.service;

import java.util.List;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

import com.baina.model.Employee;

@Service
public class EmployeeService {


	
	@Produce("direct:start")
	ProducerTemplate producerTemplate;

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployee(String process) {
		Employee emp=new Employee();
		emp.setProcess(process);
		//here we are giving empty object to the router builder and ofter processing the out put wil be the Employee type thats why we are giving that
		return  producerTemplate.requestBody(emp, List.class);		
	}
	
}
