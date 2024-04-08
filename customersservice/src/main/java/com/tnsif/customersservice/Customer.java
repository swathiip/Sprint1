package com.tnsif.customersservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer
{
	@Id
	@Column(name="cid")
	private int cid;

	@Column(name="cname")
	private String cname;
	
	@Column(name="address")
	private String address;

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	
}
