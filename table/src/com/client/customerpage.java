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

public class customerpage extends Composite  {

	private static customerpageUiBinder uiBinder = GWT.create(customerpageUiBinder.class);
	GreetingServiceAsync a1= GWT.create(GreetingService.class);

	interface customerpageUiBinder extends UiBinder<Widget, customerpage> {
	}
	

	public customerpage(String n) {
		initWidget(uiBinder.createAndBindUi(this));
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String s1=t1.getText();
				cust a2=new cust();
				a2.setEmail(n);
				a2.setQuantity(s1);
				a1.quantity(a2, new AsyncCallback<cust>() {
					
					@Override
					public void onSuccess(cust result) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}
				});
				
			}
		});
		
		
	}
@UiField
MaterialTextBox t1;
@UiField
MaterialButton btn;
	

}
