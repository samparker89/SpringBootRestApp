package com.samparker;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samparker.DAO.CustomerRepository;
import com.samparker.DOM.Customer;

@RestController
public class CustomerDetailsController {

	@Autowired
	private CustomerRepository customerDAO;
	
	@RequestMapping(path="/addCustomer", method=RequestMethod.PUT)
	public void addCustomer(@RequestBody Customer customer){

		System.out.println(customer.getId());
		customerDAO.save(customer);
		System.out.println(customer.getId());
		
	}
	
	@RequestMapping(path="/addCustomers", method=RequestMethod.PUT)
	public void addCustomers(@RequestBody List<Customer> customers){
		
		customerDAO.save(customers);
		
	}
	
}
