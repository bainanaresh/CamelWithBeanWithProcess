package com.baina.router;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Address;
import com.baina.model.Education;
import com.baina.model.Employee;

@Component
public class SetEmployeeInfo {
	
	List<Employee> listEmps=new ArrayList<>();
	
	public Employee emp1=new Employee();
	public Employee emp2=new Employee();
	public Employee emp3=new Employee();
	
	@Handler
	public void process(Exchange exchange) {
		
		int i=(int) exchange.getProperty("id");
		
		String name=(String) exchange.getProperty("name");
		
		double salary=(double) exchange.getProperty("salary");
		
		List<Education> education=exchange.getProperty("emp_education_details", List.class);
		
		List<Address> address=exchange.getProperty("employee_address_details", List.class);
		
		System.out.println(i);
		
		System.out.println(name);
		
		System.out.println(education);
		
		System.out.println(address);
		
		emp1.setId(i);
		emp1.setName(name);
		emp1.setSalary(salary);
		emp1.setEducationDetails(education);
		emp1.setAddressDetails(address);
		
		
int i2=(int) exchange.getProperty("id2");
		
		String name2=(String) exchange.getProperty("name2");
		
		List<Education> education2=exchange.getProperty("emp_education_details2", List.class);
		
		List<Address> address2=exchange.getProperty("employee_address_details2", List.class);
		double salary2=(double) exchange.getProperty("salary2");
		
		emp2.setId(i2);
		emp2.setName(name2);
		emp2.setSalary(salary2);
		emp2.setEducationDetails(education2);
		emp2.setAddressDetails(address2);
		
		
int i3=(int) exchange.getProperty("id3");
		
		String name3=(String) exchange.getProperty("name3");
		
		List<Education> education3=exchange.getProperty("emp_education_details3", List.class);
		
		List<Address> address3=exchange.getProperty("employee_address_details3", List.class);
		
		double salary3=(double) exchange.getProperty("salary3");
		
		emp3.setId(i3);
		emp3.setName(name3);
		emp3.setSalary(salary3);
		emp3.setEducationDetails(education3);
		emp3.setAddressDetails(address3);
		
		listEmps.clear();
		listEmps.add(emp1);
		listEmps.add(emp2);
		listEmps.add(emp3);
		
		exchange.getIn().setBody(listEmps);
		
	}

}
