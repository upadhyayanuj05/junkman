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
import com.shared.pickl;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class picklogin extends Composite  {

	private static pickloginUiBinder uiBinder = GWT.create(pickloginUiBinder.class);
	GreetingServiceAsync a2=GWT.create(GreetingService.class);

	interface pickloginUiBinder extends UiBinder<Widget, picklogin> {
	}

	public picklogin() {
		initWidget(uiBinder.createAndBindUi(this));
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				pickl a1=new pickl();
				a1.setEmail(t1.getText());
				a1.setPass(t2.getText());
				a2.login(a1, new AsyncCallback<pickl>() {
					
					@Override
					public void onSuccess(pickl result) {
						// TODO Auto-generated method stub
						
						if(result.getPass()=="yes")
						{
							RootPanel.get().clear();
							RootPanel.get().add(new pickpage(result.getEmail()));
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
	MaterialTextBox t1;
	
	@UiField
	MaterialTextBox t2;
	
	@UiField
	MaterialButton btn;

}
