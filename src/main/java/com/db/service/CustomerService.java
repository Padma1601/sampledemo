package com.db.service;

import java.util.List;

import com.db.dto.CustomerDto;
import com.db.model.Customer;

public interface CustomerService {
public Customer SaveCustomerInfo (CustomerDto customerDto);

public List<Customer> getAllCustomerDetails();




}
