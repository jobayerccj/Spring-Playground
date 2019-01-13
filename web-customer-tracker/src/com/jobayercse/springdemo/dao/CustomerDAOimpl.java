package com.jobayercse.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jobayercse.springdemo.entity.Customer;

@Repository
public class CustomerDAOimpl implements CustomerDAO {
	
	//inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		// get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		
		//execute query & get result
		List<Customer> customers = theQuery.getResultList(); 
		
		//return result
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save customer to db
		currentSession.save(theCustomer);
		
	}

}
