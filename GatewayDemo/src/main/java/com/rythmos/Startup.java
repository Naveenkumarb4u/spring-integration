package com.rythmos;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {

	public static void main(String[] args) {
		
		try{
			ClassPathXmlApplicationContext context	=	new ClassPathXmlApplicationContext("beans.xml");
		
		/*MessageChannel channel	=	context.getBean("requestChannel", MessageChannel.class);
		Message<String> message	=	MessageBuilder.withPayload("I am Navy").build();
		channel.send(message);*/
		
		UpperCaseService service	=	context.getBean("xyzService", UpperCaseService.class);
		
		/* System.out.println(service.translate("Hello brave new world"));
		*/
		
		// Post-Asynchronous work
		Future<String> future	=	service.translate("Helllllllloooooooooooooooooooooo");
		// do more work here in a real application
		String str	=	future.get(5000, TimeUnit.SECONDS);
		System.out.println(str);
		context.close();
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
	}

}
