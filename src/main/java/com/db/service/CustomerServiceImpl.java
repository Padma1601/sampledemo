package com.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.dto.CustomerDto;
import com.db.model.Customer;
import com.db.repository.CustomerRepositoryService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepositoryService customerRepositoryService;

	@Override
	public Customer SaveCustomerInfo(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setid(customerDto.getid());
		customer.setCustomerName(customerDto.getCustomerName());
		customer.setMobileNumber(customerDto.getMobileNumber());
		customer.setLocation(customerDto.getLocation());
		return customerRepositoryService.save(customer);
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerRepositoryService.findAll();
	}

}
