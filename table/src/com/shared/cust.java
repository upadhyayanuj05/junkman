package com.shared;

import java.io.Serializable;

public class cust  implements Serializable{
	String name;
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getArea() {
		return area;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getEmail() {
		return email;
	}
	public String getPass() {
		return pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	String address;
	String area;
	String quantity;
	String email;
	String pass;
	String mobile;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
