package com.abhishek.app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.app.entities.CustomerEntity;
import com.abhishek.app.entities.CustomerResponse;
import com.abhishek.app.entities.CustomerRowMapper;



@RestController
public class Controller {
	
	@Autowired
	private JdbcTemplate  jdbcTemplate;
	
	/*@RequestMapping(value="/getAllCustomers",method=RequestMethod.GET, headers = "Accept=application/json")
	public CustomerResponse getAllCustomer(){
		CustomerResponse customerResponse = new CustomerResponse();
		String getAllCustomersSQL="Select id,customer_name from customer ";
		customerResponse.setCustomerEntity(jdbcTemplate.query(getAllCustomersSQL,new CustomerRowMapper()));
		customerResponse.setStatus("Success");
		customerResponse.setMessage("No_Exceptions");
		return customerResponse;
	}*/
	
	@RequestMapping(value="/getAllCustomers",method=RequestMethod.GET, headers = "Accept=application/json")
	public List<CustomerEntity> getAllCustomer(){
		CustomerResponse customerResponse = new CustomerResponse();
		String getAllCustomersSQL="Select id,customer_name from customer ";
		List<CustomerEntity> customerList=(jdbcTemplate.query(getAllCustomersSQL,new CustomerRowMapper()));
		
		return customerList;
	}

}
