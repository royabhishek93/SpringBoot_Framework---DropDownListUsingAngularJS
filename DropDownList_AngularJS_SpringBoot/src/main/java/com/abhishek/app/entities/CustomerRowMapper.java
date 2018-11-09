package com.abhishek.app.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<CustomerEntity>{

	@Override
	public CustomerEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CustomerEntity customer= new CustomerEntity();
		customer.setCustomerId(rs.getInt("id"));
		customer.setCustomerName(rs.getString("customer_name"));
		//customer.setEmail(rs.getString("email"));
		return customer;
	}



}
  