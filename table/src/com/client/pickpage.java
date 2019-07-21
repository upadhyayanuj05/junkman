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

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;

public class pickpage extends Composite {

	private static pickpageUiBinder uiBinder = GWT.create(pickpageUiBinder.class);
	GreetingServiceAsync  a1=GWT.create(GreetingService.class);

	interface pickpageUiBinder extends UiBinder<Widget, pickpage> {
	}

	public pickpage(String email) {
//		t2.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				// TODO Auto-generated method stub
//				String n=t1.getText();
//				a1.pdata(n, new AsyncCallback<cust[]>() {
//					
//					@Override
//					public void onSuccess(cust[] result) {
//						// TODO Auto-generated method stub
//						
//						for(int i=0;i<result.length;i++)
//						{
//							MaterialRow r= new MaterialRow();
//							MaterialColumn c1=new MaterialColumn();
//							MaterialTextBox t1=new MaterialTextBox();
//							t1.setText(result[i].getName());
//							c1.add(t1);
//							
//							MaterialColumn c2=new MaterialColumn();
//							MaterialTextBox t2=new MaterialTextBox();
//							t2.setText(result[i].getAddress());
//							c2.add(t2);
//							
//							MaterialColumn c3=new MaterialColumn();
//							MaterialTextBox t3=new MaterialTextBox();
//							t3.setText(result[i].getArea());
//							c3.add(t3);
//							
//							MaterialColumn c4=new MaterialColumn();
//							MaterialTextBox t4=new MaterialTextBox();
//							t4.setText(result[i].getQuantity());
//							c4.add(t4);
//							
//							MaterialColumn c5=new MaterialColumn();
//							MaterialButton b=new MaterialButton();
//							b.setText("verify");
//							String aa=result[i].getEmail();
//							c5.add(b);
//							b.addClickHandler(new ClickHandler()
//							{
//								
//								@Override
//								public void onClick(ClickEvent event) {
//									// TODO Auto-generated method stub
//								Window.alert(aa);
//								}
//							});
//							
//							
//							r.add(c1);
//							r.add(c2);
//							r.add(c3);
//							r.add(c4);
//							r.add(c5);
//							RootPanel.get("tt1").add(r);
//							
//							
//						}
//						
//					}
//					
//					@Override
//					public void onFailure(Throwable caught) {
//						// TODO Auto-generated method stub
//						
//					}
//				});
//				
//			}
//		});
//		initWidget(uiBinder.createAndBindUi(this));
//		
//		
//		
//	}
//
//	@UiField
//	MaterialTextBox t1;
//	
//	@UiField
//	MaterialButton t2;
	

}
}
