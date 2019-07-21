package com.client;

import com.google.gwt.user.client.rpc.RemoteService;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.shared.Emp;
import com.shared.cust;
import com.shared.fill;
import com.shared.pick;
import com.shared.pickl;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
  Emp adminlogin(Emp n)throws IllegalArgumentException;
  pick addpick(pick n) throws IllegalArgumentException;
  pickl login(pickl z) throws IllegalArgumentException;
  cust[] data () throws IllegalArgumentException;
  cust cdata(cust n) throws IllegalArgumentException;
  Emp custlogin(Emp n)throws IllegalArgumentException;
  cust quantity(cust n)throws IllegalArgumentException;
  cust[] pdata(String n) throws IllegalArgumentException;
  cust[] filter(String area) throws IllegalArgumentException;
  fill[] filterr()throws IllegalArgumentException;
}
