package com.baina.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.baina.router.processor.EmployeeBeansProcessing;
import com.baina.router.processor.EmployeeBeansWithOutProcessing;
@Component
public class ApplicationBeanRouterWithProcessor extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		System.out.println("started routing**********");
		
		from("direct:start")
		.bean(SetEmployeeBasicInfo.class)
		.bean(SetEmployeeEducationInfo.class)
		.bean(SetAddressInfo.class)
		.bean(SetEmployeeInfo.class)
		.choice().when(exchange->{
			boolean process=(boolean) exchange.getProperty("process");
			if(process==true) {
			return true;
			}
			return false;
		}).bean(EmployeeBeansProcessing.class).end()
		.choice().when(exchange->{
			boolean process=(boolean) exchange.getProperty("process");
			if(process==false) {
			return true;
			}
			return false;
		}).bean(EmployeeBeansWithOutProcessing.class)
		.end();

		
		System.out.println("ended routing**************");
		
	

	}

}
