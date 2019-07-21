package com.shared;

import java.io.Serializable;

public class pickl implements Serializable {
	String email;
	public String getEmail() {
		return email;
	}
	public String getPass() {
		return pass;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	String pass;

}
