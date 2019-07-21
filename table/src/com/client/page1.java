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
import com.shared.fill;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.table.MaterialDataTable;

public class page1 extends Composite  {

	private static page1UiBinder uiBinder = GWT.create(page1UiBinder.class);
	GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface page1UiBinder extends UiBinder<Widget, page1> {
	}

	public page1() {
		
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String s=t1.getText();
				a1.filter(s, new AsyncCallback<cust[]>() {
					
					@Override
					public void onSuccess(cust[] result) {
						// TODO Auto-generated method stub
						RootPanel.get("a").clear();
						int i;
						if(result.length!=0)
						Window.alert("1");
						else
							Window.alert("2");
					       
						for(i=0;i<result.length;i++) {
							MaterialRow r=new MaterialRow();
							MaterialColumn c1=new MaterialColumn();
							MaterialTextBox t1=new MaterialTextBox();
							t1.setText(result[i].getName());
							c1.add(t1);
							
							MaterialColumn c3=new MaterialColumn();
							MaterialTextBox t3=new MaterialTextBox();
							t3.setText(result[i].getAddress());
							c3.add(t3);
							
							MaterialColumn c4=new MaterialColumn();
							MaterialTextBox t4=new MaterialTextBox();
							t4.setText(result[i].getArea());
							c4.add(t4);
							
							MaterialColumn c5=new MaterialColumn();
							MaterialTextBox t5=new MaterialTextBox();
							t5.setText(result[i].getQuantity());
							c5.add(t5);
							
							MaterialColumn c6=new MaterialColumn();
							MaterialTextBox t6=new MaterialTextBox();
							t6.setText(result[i].getEmail());
							c6.add(t6);
							
							MaterialColumn c8=new MaterialColumn();
							MaterialTextBox t8=new MaterialTextBox();
							t6.setText(result[i].getMobile());
							c6.add(t6);
							
							
							MaterialColumn c7=new MaterialColumn();
							Button b=new Button();
							b.setText("forward");
							b.addClickHandler(new ClickHandler() {
								public void onClick(ClickEvent event) {
									Window.alert(t6.getText());
								}
							});
							c7.add(b);
							r.add(c1);
							r.add(c3);
							r.add(c4);
							r.add(c5);
							r.add(c6);
							r.add(c7);
							r.add(c8);
							RootPanel.get("a").add(r);
						
					}
					}
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}
					
				});
					
			}			
		});
		
		
		b2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				a1.filterr(new AsyncCallback<fill[]>() {
					
					@Override
					public void onSuccess(fill[] result) {
						// TODO Auto-generated method stub
						int i;
						if(result.length!=0)
						Window.alert("1");
						else
							Window.alert("2");
					       
						for(i=0;i<result.length;i++) {
							MaterialRow r=new MaterialRow();
							
							MaterialColumn c1=new MaterialColumn();
							MaterialTextBox t1=new MaterialTextBox();
							t1.setText(result[i].getArea());
							c1.add(t1);
							
							MaterialColumn c3=new MaterialColumn();
							MaterialTextBox t3=new MaterialTextBox();
							t3.setText(result[i].getQuantity());
							c3.add(t3);
							
							r.add(c1);
							r.add(c3);
		
							RootPanel.get("a").add(r);
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
	MaterialButton b1,b2;
	
	

}
