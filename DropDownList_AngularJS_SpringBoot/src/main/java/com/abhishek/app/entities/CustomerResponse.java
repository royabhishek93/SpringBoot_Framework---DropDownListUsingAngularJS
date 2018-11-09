package com.abhishek.app.entities;

import java.util.List;

public class CustomerResponse {

	private List<CustomerEntity>  customerEntity;
	private String status;
	private String message;
	
	public List<CustomerEntity> getCustomerEntity() {
		return customerEntity;
	}
	public void setCustomerEntity(List<CustomerEntity> customerEntity) {
		this.customerEntity = customerEntity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
