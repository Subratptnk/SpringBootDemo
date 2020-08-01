package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int cid;
	private String cname;
	private String email;
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public String getEmail() {
		return email;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + "]";
	}
	
	
	
}
