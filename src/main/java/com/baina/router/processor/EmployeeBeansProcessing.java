package com.baina.router.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.baina.model.Employee;

@Component
public class EmployeeBeansProcessing {

	@Handler
	public void process(Exchange exchange) throws Exception {
		List<Employee> listEmps=(List<Employee>) exchange.getIn().getBody();
		List<Employee> salaryMoreThan20k=new ArrayList<>();
		
		listEmps.stream().forEach(list->{
			if(list.getSalary()>20000) {
				salaryMoreThan20k.add(list);
			}	
		});
		
		 exchange.getIn().setBody(salaryMoreThan20k);
		
		/* exchange.getIn().setBody(listEmps); */

	}

}
