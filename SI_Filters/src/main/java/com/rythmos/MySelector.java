package com.rythmos;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class MySelector implements MessageSelector {

	public boolean accept(Message<?> message) {
		
		if((message.getPayload() instanceof File) && ((File) message.getPayload()).getName().startsWith("msg"))
		{
			return false;			
		}
		return true;
	}

}
