package com.shared;

import java.io.Serializable;

public class pick implements Serializable{
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String name;
	String address;
	String phone;
	String email;
	String rarea;
	public String getRarea() {
		return rarea;
	}
	public void setRarea(String rarea) {
		this.rarea = rarea;
	}

}
