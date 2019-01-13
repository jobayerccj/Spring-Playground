package com.jobayercse.springdemo.dao;

import java.util.List;

import com.jobayercse.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
