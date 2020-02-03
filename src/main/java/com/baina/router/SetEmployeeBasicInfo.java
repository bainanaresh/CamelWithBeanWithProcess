package com.baina.router;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Employee;
@Component
public class SetEmployeeBasicInfo {

	@Handler
	public void process(Exchange exchange) {
		
		Employee emp=exchange.getIn().getBody(Employee.class);
		
		boolean process=Boolean.parseBoolean(emp.getProcess());
		
		exchange.setProperty("process", process);
		
//		Employee e = exchange.getIn().getBody(Employee.class);
		System.out.println("set emp basic info*******");
		exchange.setProperty("id",1);
		exchange.setProperty("name","Naresh");
		exchange.setProperty("salary",9000.0);
		
		System.out.println("set emp basic info*******");
		exchange.setProperty("id2",2);
		exchange.setProperty("name2","Naresh2");
		exchange.setProperty("salary2",11000.0);
		
		System.out.println("set emp basic info*******");
		exchange.setProperty("id3",3);
		exchange.setProperty("name3","Naresh3");
		exchange.setProperty("salary3",21000.0);
		
	}
}
