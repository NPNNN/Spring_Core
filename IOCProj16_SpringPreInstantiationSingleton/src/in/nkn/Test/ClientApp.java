package in.nkn.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nkn.bean.Flipcard;


public class ClientApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("IOC container created....");
	}

}
