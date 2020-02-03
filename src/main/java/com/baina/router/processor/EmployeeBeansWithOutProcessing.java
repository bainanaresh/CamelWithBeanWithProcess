package com.baina.router.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Employee;

@Component
public class EmployeeBeansWithOutProcessing {


	@Handler
	public void process(Exchange exchange) throws Exception {
		List<Employee> listEmps=(List<Employee>) exchange.getIn().getBody();
		
		
		 exchange.getIn().setBody(listEmps);

	}



}
