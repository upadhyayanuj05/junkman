package com.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import com.shared.Emp;
import com.shared.cust;
import com.shared.fill;
import com.shared.pick;
import com.shared.pickl;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
  void adminlogin(Emp n,AsyncCallback<Emp> callback) throws IllegalArgumentException;
  void addpick(pick n, AsyncCallback<pick> callback) throws IllegalArgumentException;
  void login (pickl z,AsyncCallback<pickl> callback) throws IllegalArgumentException;
  void data(AsyncCallback<cust[]> callback) throws IllegalArgumentException;
  void cdata(cust n,AsyncCallback<cust> callback) throws IllegalArgumentException;
  void custlogin(Emp n,AsyncCallback<Emp> callback) throws IllegalArgumentException;
  void quantity(cust n,AsyncCallback<cust> callback) throws IllegalArgumentException;
  void pdata(String n,AsyncCallback<cust[]> callback) throws IllegalArgumentException;
  void filter(String area, AsyncCallback<cust[]> callback)
	      throws IllegalArgumentException;
	  void filterr(AsyncCallback<fill[]> callback)
		      throws IllegalArgumentException;
}
