package com.rythmos.resource;

import org.springframework.messaging.Message;

public class PrintAggregater {
	
	public String display(String str){
		
		System.out.println("\n\nAggregated output is:-");
		System.out.println(str);
		System.out.println("##########################################################");
		return str;
	}

}
