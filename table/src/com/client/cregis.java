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
import com.google.gwt.user.client.ui.Widget;
import com.shared.cust;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class cregis extends Composite  {

	private static cregisUiBinder uiBinder = GWT.create(cregisUiBinder.class);
	
	GreetingServiceAsync aa3 = GWT.create(GreetingService.class);

	interface cregisUiBinder extends UiBinder<Widget, cregis> {
	}

	public cregis() {
		initWidget(uiBinder.createAndBindUi(this));
		register.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String c1 = name.getText();
				String c2 = mobile.getText();
				String c3 = email.getText();
				String c4 = location.getText();
				String c5 = pin.getText();
				String c6 = pass.getText();
				cust aa=new cust();
				aa.setName(c1);
				aa.setMobile(c2);
				aa.setEmail(c3);
				aa.setAddress(c4);
				aa.setArea(c5);
				aa.setPass(c6);
				aa.setQuantity("0");
				Window.alert(c1+" "+c2);
				aa3.cdata(aa, new AsyncCallback<cust>() {
					
					@Override
					public void onSuccess(cust result) {
						
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
												
					}
				});
				
			}
		});
		
	}
	@UiField
	MaterialTextBox name;
	
	@UiField
	MaterialTextBox mobile;
	
	@UiField
	MaterialTextBox email;
	
	@UiField
	MaterialTextBox location;
	
	@UiField
	MaterialTextBox pin;
	
	@UiField
	MaterialTextBox pass;
	
	
	
	
	@UiField
	MaterialButton register;

}
