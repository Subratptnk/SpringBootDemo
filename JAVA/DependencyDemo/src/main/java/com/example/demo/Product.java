package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int prodId;
	private String ProdName;
	
	public int getProdId() {
		return prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	
	public void prod()
	{
		System.out.println("all good");
	}
}
