package com.travelService.helperutil;

import org.springframework.stereotype.Component;

@Component
public class ProfileHelper {
	
	int org_cost = 100; 
	int n_price = 140; 
	
	String GST = ("((N_price - org_cost) * 100)/org_cost");

	String s1 = "ticket_price";
	String s2 = "GST";
	
	private String ticket_price;
	String s3 = "total_price";
	
	public String total_price(String gst2) {
		String total_price = (ticket_price + GST);
		
		return total_price ;
	}
	
	
}