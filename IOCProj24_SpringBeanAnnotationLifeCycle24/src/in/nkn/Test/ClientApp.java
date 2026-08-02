package in.nkn.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nkn.comp.voterVerifier;

public class ClientApp {

	public static void main(String [] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("in/nkn/cfg/applicationContext.xml");
	    
		System.out.println("instantiation of the Bean...");
		voterVerifier voterVerifier = applicationContext.getBean("voterVerifier",voterVerifier.class);
		System.out.println(voterVerifier);
		
		System.out.println("Working with the business logic...");
		String status = voterVerifier.checkEligibility();
		System.out.println(status);
		
		applicationContext.close();
		System.out.println("Deinstantiaion of the Bean...");
	}
}
