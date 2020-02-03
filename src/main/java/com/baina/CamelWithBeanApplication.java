package com.baina;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.baina.router.SetAddressInfo;
import com.baina.router.SetEmployeeBasicInfo;
import com.baina.router.SetEmployeeEducationInfo;
import com.baina.router.SetEmployeeInfo;

@SpringBootApplication
@Component
public class CamelWithBeanApplication{

	public static void main(String[] args) {
		SpringApplication.run(CamelWithBeanApplication.class, args);
		 
		
	}
	

}
