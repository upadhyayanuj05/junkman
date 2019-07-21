package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.cust;

import gwt.material.design.client.MaterialTable;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;

public class admin extends Composite  {

	private static adminUiBinder uiBinder = GWT.create(adminUiBinder.class);
	GreetingServiceAsync a2= GWT.create(GreetingService.class);

	interface adminUiBinder extends UiBinder<Widget, admin> {
	}

	public admin() {
		initWidget(uiBinder.createAndBindUi(this));
		p1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				RootPanel.get().add(new page1());
			}
		});
		p2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				con.clear();
				con.add(new pickupman());
			}
		});
		
		
		logout.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				RootPanel.get().add(new adminlogin());
			}
		});
		home.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				RootPanel.get().add(new admin());
			}
		});
		a2.data(new AsyncCallback<cust[]>() {
		
			@Override
			public void onSuccess(cust[] result) {
				// TODO Auto-generated method stub
				for(int i=0;i<result.length;i++)
				{
					MaterialRow r= new MaterialRow();
					MaterialColumn c1=new MaterialColumn();
					MaterialTextBox t1=new MaterialTextBox();
					t1.setText(result[i].getName());
					c1.add(t1);
					
					MaterialColumn c2=new MaterialColumn();
					MaterialTextBox t2=new MaterialTextBox();
					t2.setText(result[i].getAddress());
					c2.add(t2);
					
					MaterialColumn c3=new MaterialColumn();
					MaterialTextBox t3=new MaterialTextBox();
					t3.setText(result[i].getArea());
					c3.add(t3);
					
					MaterialColumn c4=new MaterialColumn();
					MaterialTextBox t4=new MaterialTextBox();
					t4.setText(result[i].getQuantity());
					c4.add(t4);
					
					MaterialColumn c5=new MaterialColumn();
					MaterialButton b=new MaterialButton();
					b.setText("forward");
					String aa=result[i].getEmail();
					c5.add(b);
					b.addClickHandler(new ClickHandler()
					{
						
						@Override
						public void onClick(ClickEvent event) {
							// TODO Auto-generated method stub
						Window.alert(aa);
						}
					});
					
					
					r.add(c1);
					r.add(c2);
					r.add(c3);
					r.add(c4);
					r.add(c5);
					RootPanel.get().add(r);
					
					
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert("error");
				
			}
		});
		
	}

	@UiField
	MaterialLink p1;
	
	@UiField
	MaterialLink p2;
	
	@UiField
	MaterialContainer con;
	
	@UiField
	MaterialLink logout;
	
	@UiField
	MaterialLink home;
}
