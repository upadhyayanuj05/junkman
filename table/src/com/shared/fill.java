package com.shared;
import java.io.Serializable;

public class fill implements Serializable {
	String area;
	public String getArea() {
		return area;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	String quantity;

}
