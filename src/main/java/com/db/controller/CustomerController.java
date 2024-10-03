package com.db.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.dto.CustomerDto;
import com.db.model.Customer;
import com.db.service.CustomerService;
@RestController
@RequestMapping("customer")
public class CustomerController {
@Autowired
private CustomerService customerService;
@PostMapping("/savecustomer")
public Map<String, Object> savecustomer(@RequestBody CustomerDto customerDto) {
	Customer customer=customerService.SaveCustomerInfo(customerDto);
	Map<String,Object> received=new HashMap<>();
	
	if(customer!=null) {
		received.put("Status", HttpStatus.OK);
		received.put("Message","Your Information is Succesfully Imported");
		received.put("timestamp", new Date());
		return received;
	}
	received.put("status", HttpStatus.BAD_REQUEST);
	received.put("Message", "Your Request is invalid");
	received.put("timestamp", new Date());
	return received;
}
@GetMapping("/getall")
public List<Customer>getAllCustomer(){
	return customerService.getAllCustomerDetails();
	
}

}
