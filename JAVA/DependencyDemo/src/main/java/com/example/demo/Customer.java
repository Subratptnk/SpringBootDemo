package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int custId;
	private String custName;
	private String productName;
	// Auto wire annotation is used enable a class to recognise the other class and make sure the dependencies are satisfied
	@Autowired							
	private Product product;
	
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public String getProductName() {
		return productName;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void display()
	{
		System.out.println("Object returned success");
		product.prod();
	}
	
}
