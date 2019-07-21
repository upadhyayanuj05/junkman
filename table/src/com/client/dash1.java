package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialLink;

public class dash1 extends Composite {

	private static dash1UiBinder uiBinder = GWT.create(dash1UiBinder.class);

	interface dash1UiBinder extends UiBinder<Widget, dash1> {
	}

	public dash1() {
		initWidget(uiBinder.createAndBindUi(this));
		admin.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
					RootPanel.get().clear();
					RootPanel.get().add(new adminlogin());
			}
		});
		pickup.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				RootPanel.get().add(new picklogin());
				
			}
		});
		customer.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				RootPanel.get().add(new customerlogin());
			}
		});
	}

	@UiField
	MaterialLink admin, pickup,customer;
	

}
