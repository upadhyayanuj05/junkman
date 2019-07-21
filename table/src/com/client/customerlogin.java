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
import com.shared.Emp;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class customerlogin extends Composite  {

	private static customerloginUiBinder uiBinder = GWT.create(customerloginUiBinder.class);
	
	GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface customerloginUiBinder extends UiBinder<Widget, customerlogin> {
	}

	public customerlogin() {
		initWidget(uiBinder.createAndBindUi(this));
		signup.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				RootPanel.get().add(new cregis());
			}
		});
		btnlogin.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Emp aa4=new Emp();
				String s1=email.getText();
				aa4.setEmail(email.getText());
				aa4.setPass(pass.getText());
				a1.custlogin(aa4, new AsyncCallback<Emp>() {
					
					@Override
					public void onSuccess(Emp result) {
						// TODO Auto-generated method stub
						if(result.getPass()=="yes")
						{
							RootPanel.get().clear();
							RootPanel.get().add(new customerpage(s1));
						}
						else
						{
							Window.alert("enter valid email and password");
						}
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
	MaterialTextBox email;
	
	@UiField
	MaterialTextBox pass;
	
	@UiField
	MaterialButton btnlogin;
	
	@UiField
	MaterialButton signup;
	
	
}
