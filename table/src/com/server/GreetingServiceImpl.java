package com.server;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.client.GreetingService;
import com.shared.Emp;
import com.shared.FieldVerifier;
import com.shared.cust;
import com.shared.fill;
import com.shared.pick;
import com.shared.pickl;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {
	Connection con =null;
	Statement st=null;
	PreparedStatement pt=null;
	ResultSet rs=null;
	int a=0;
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	


@Override
public pick addpick(pick n) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	String query="insert into pickupman values(?,?,?,?,?)";
	String s1=n.getName();
	String s2=n.getAddress();
	String s3=n.getPhone();
	String s4=n.getEmail();
	String s5=n.getRarea();
	try {
		pt=con.prepareStatement(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		pt.setString(1, s1);
		pt.setString(2, s2);
		pt.setString(3, s3);
		pt.setString(4, s4);
		pt.setString(5, s5);
		pt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
			
    
	

	return n;
}





@Override
public Emp adminlogin(Emp n) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	String s1=n.getEmail();
	String s2=n.getPass();
	try {
		rs=st.executeQuery("select * from admin where email='"+s1+"' and pass='"+s2+"'");
		if(rs.next())
		{
			n.setPass("yes");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return n;
}





@Override
public pickl login(pickl z) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	String s1=z.getEmail();
	String s2=z.getPass();
	try {
		rs=st.executeQuery("select * from pickupman where phone='"+s2+"' and email='"+s1+"'");
		if(rs.next())
		{
			z.setPass("yes");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return z;
}





@Override
public cust[] data() throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	
	int m=0;
	
		
			try {
				rs=st.executeQuery("Select * from customer");
				rs.last();
				m= rs.getRow();
				rs.first();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 cust p[]= new cust[m];
			
		
			try {
		
		while(rs.next())
		{
			p[a]=new cust();
			p[a].setName(rs.getString(1));
			p[a].setAddress(rs.getString(2));
			p[a].setArea(rs.getString(3));
			p[a].setQuantity(rs.getString(4));
			p[a].setEmail(rs.getString(5));
			p[a].setMobile(rs.getString(7));
			p[a].setPass(rs.getString(6));
			a++;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
		
	return p;
}





@Override
public cust cdata(cust n) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	
	String Query="insert into customer values(?,?,?,?,?,?,?)";
	String c1=n.getName();
	String c2=n.getAddress();
	String c3=n.getArea();
	String c4=n.getQuantity();
	String c5=n.getEmail();
	String c6=n.getMobile();
	String c7=n.getPass();
	
	
	try {
		pt=con.prepareStatement(Query);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	try {
		pt.setString(1, c1);
		pt.setString(2, c2);
		pt.setString(3, c3);
		pt.setString(4, c4);
		pt.setString(5, c5);
		pt.setString(6, c7);
		pt.setString(7, c6);
		pt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	Window.alert(c2);
	return n;
}





@Override
public Emp custlogin(Emp n) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	ResultSet rs=null;
	String s1=n.getEmail();
	String s2=n.getPass();
	try {
		rs=st.executeQuery("select * from customer where email='"+s1+"' and pass='"+s2+"'");
		if(rs.next())
		{
			n.setPass("yes");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return n;
}





@Override
public cust quantity(cust n) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	String s1=n.getEmail();
	String s2=n.getQuantity();
	ResultSet rs=null;
	try {
		int k=st.executeUpdate("update customer set quantity='"+s2+"' where email='"+s1+"'");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return n;
}





@Override
public cust[] pdata(String n) throws IllegalArgumentException {
	// TODO Auto-generated method stub
ResultSet rs=null;
Window.alert(n);
	
	int m=0;
	a=0;
	
		
			try {
				rs=st.executeQuery("Select * from customer where area='"+n+"'");
				rs.last();
				m= rs.getRow();
				rs.first();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 cust p[]= new cust[m];
			
		
			try {
		
		while(rs.next())
		{
			p[a]=new cust();
			p[a].setName(rs.getString(1));
			p[a].setAddress(rs.getString(2));
			p[a].setArea(rs.getString(3));
			p[a].setQuantity(rs.getString(4));
			p[a].setEmail(rs.getString(5));
			a++;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
	return p;
}





@Override
public cust[] filter(String area) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	init();
	String query="select * from customer where area='"+area+"'";
	cust[] f=null;
	try {
		rs=st.executeQuery(query);
		while(rs.next())
		{
			a++;
		}
		f=new cust[a];
		rs=st.executeQuery(query);
		int i=0;
		while(rs.next())
		{
			f[i]=new cust();
			f[i].setName(rs.getString(1));
			f[i].setAddress(rs.getString(2));
			f[i].setArea(rs.getString(3));
			f[i].setQuantity(rs.getString(4));
			f[i].setEmail(rs.getString(5));
			f[i].setPass(rs.getString(6));
			f[i].setMobile(rs.getString(7));
			i++;
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return f;
}





@Override
public fill[] filterr() throws IllegalArgumentException {
	// TODO Auto-generated method stub
	init();
	fill[] f=null;
	try {
		rs=st.executeQuery("select area,sum(quantity) from customer group by area");
		while(rs.next())
		{
			a++;
		}
		f=new fill[a];
		rs=st.executeQuery("select area,sum(quantity) from customer group by area");
		int i=0;
		while(rs.next())
		{
			f[i]=new fill();
			f[i].setArea(rs.getString(1));
			f[i].setQuantity(rs.getString(2));
			i++;
		}
	} catch (SQLException e) {
		e.printStackTrace();
		Window.alert(e.getMessage());
	}
	return f;
}

}











