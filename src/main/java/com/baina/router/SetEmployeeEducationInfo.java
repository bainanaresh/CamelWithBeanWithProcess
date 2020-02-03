package com.baina.router;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Education;

@Component
public class SetEmployeeEducationInfo {

	@Handler
	public void process(Exchange exchange) {
		List<Education> education=new ArrayList<>();
		Education ed1 = new Education();
		ed1.setEduInsName("ZPHS VVRAOPET");
		ed1.setStandard("9th to 10th");
		ed1.setYearOfPassing(2010);
		
		Education ed2 = new Education();
		ed2.setEduInsName("GJC RAIKAL");
		ed2.setStandard("11th to 12th");
		ed2.setYearOfPassing(2012);
		
		Education ed3 = new Education();
		ed3.setEduInsName("Sreayas Institute of Engineering And Technology");
		ed3.setStandard("9th to 10th");
		ed3.setYearOfPassing(2016);
		
		education.add(ed1);
		education.add(ed2);
		education.add(ed3);
		
		exchange.setProperty("emp_education_details", education);
		
		
		/**************** emp2 *****************/
		
		List<Education> education2=new ArrayList<>();
		Education ed4 = new Education();
		ed4.setEduInsName("ZPHS VVRAOPET");
		ed4.setStandard("9th to 10th");
		ed4.setYearOfPassing(2010);
		
		Education ed5 = new Education();
		ed5.setEduInsName("GJC RAIKAL");
		ed5.setStandard("11th to 12th");
		ed5.setYearOfPassing(2012);
		
		Education ed6 = new Education();
		ed6.setEduInsName("Sreayas Institute of Engineering And Technology");
		ed6.setStandard("9th to 10th");
		ed6.setYearOfPassing(2016);
		
		education2.add(ed4);
		education2.add(ed5);
		education2.add(ed6);
		
		exchange.setProperty("emp_education_details2", education2);
		
		
		/**************** emp3 *****************/
		
		
		List<Education> education3=new ArrayList<>();
		Education ed7 = new Education();
		ed7.setEduInsName("ZPHS VVRAOPET");
		ed7.setStandard("9th to 10th");
		ed7.setYearOfPassing(2010);
		
		Education ed8 = new Education();
		ed8.setEduInsName("GJC RAIKAL");
		ed8.setStandard("11th to 12th");
		ed8.setYearOfPassing(2012);
		
		Education ed9 = new Education();
		ed9.setEduInsName("Sreayas Institute of Engineering And Technology");
		ed9.setStandard("9th to 10th");
		ed9.setYearOfPassing(2016);
		
		education3.add(ed7);
		education3.add(ed8);
		education3.add(ed9);
		
		exchange.setProperty("emp_education_details3", education3);
		
		
	}

}
