package com.baina.router;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Address;
import com.baina.model.Education;

@Component
public class SetAddressInfo {

	@Handler
	public void process(Exchange exchange) {

		List<Address> address = new ArrayList<>();

		Address presentAddress = new Address("present", "bharathamatha street", "v v raopet", "505331", "india");

		Address permanentAddress = new Address("permanent", "bharathamatha street", "v v raopet", "505331", "india");

		address.add(presentAddress);
		address.add(permanentAddress);

		exchange.setProperty("employee_address_details", address);
		
		/* ****************emp2 *********************/

		List<Address> address2 = new ArrayList<>();

		Address presentAddress2 = new Address("present", "bharathamatha street", "v v raopet", "505331", "india");

		Address permanentAddress2 = new Address("permanent", "bharathamatha street", "v v raopet", "505331", "india");

		address2.add(presentAddress2);
		address2.add(permanentAddress2);

		exchange.setProperty("employee_address_details2", address2);
		
		/* ****************emp2 *********************/

		List<Address> address3 = new ArrayList<>();

		Address presentAddress3 = new Address("present", "bharathamatha street", "v v raopet", "505331", "india");

		Address permanentAddress3 = new Address("permanent", "bharathamatha street", "v v raopet", "505331", "india");

		address3.add(presentAddress3);
		address3.add(permanentAddress3);

		exchange.setProperty("employee_address_details3", address3);

	}

}
