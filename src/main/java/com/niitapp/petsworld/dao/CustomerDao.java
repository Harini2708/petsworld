package com.niitapp.petsworld.dao;

import java.util.List;

import com.niitapp.petsworld.model.Customer;

public interface CustomerDao {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
