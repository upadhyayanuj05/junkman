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
import com.shared.pick;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class pickadd extends Composite  {

	private static pickaddUiBinder uiBinder = GWT.create(pickaddUiBinder.class);
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	interface pickaddUiBinder extends UiBinder<Widget, pickadd> {
	}

	public pickadd() {
		initWidget(uiBinder.createAndBindUi(this));
		back.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				RootPanel.get().add(new admin());
			}
		});
		add.addClickHandler(new ClickHandler() {
			
			@Override
			
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				pick a2=new pick();
				a2.setName(name.getText());
				a2.setAddress(address.getText());
				a2.setPhone(phone.getText());
				a2.setEmail(email.getText());
				a2.setRarea("no request");
				a1.addpick(a2, new AsyncCallback<pick>() {
					
					@Override
					public void onSuccess(pick result) {
						// TODO Auto-generated method stub
						Window.alert(result.getName());
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
	MaterialButton back;
	@UiField
	MaterialTextBox name;
	@UiField
	MaterialTextBox address;
	@UiField
	MaterialTextBox phone;
	@UiField
	MaterialTextBox email;
	@UiField
	MaterialButton add;
	

}
