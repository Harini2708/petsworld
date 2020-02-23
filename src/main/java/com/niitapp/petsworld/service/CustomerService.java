package com.niitapp.petsworld.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niitapp.petsworld.model.Customer;


@Service
public interface CustomerService {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
