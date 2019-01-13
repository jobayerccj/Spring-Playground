package com.jobayercse.springdemo.service;

import java.util.List;

import com.jobayercse.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
