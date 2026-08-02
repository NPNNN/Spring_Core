package in.nkn.Test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.FileSystemResource;

import in.nkn.springcore.WishMessageGenerator;

public class TestApp {

	
	public static void main(String[] args) {
		
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");

		//Creating an IOC container
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		//Requesting IOC container to give the object
        //Object object = factory.getBean("wmg");
        //WishMessageGenerator generator = (WishMessageGenerator) object;
		 
		//Above 2 line we can write in one line
		//Request IOC container to give the object, Searching will happen in cache and 
		//if it is not found then object will create by loading and performing constructor injection
		WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("wmg");
		  

		//Using to target object performing the operation and printing the result
		String wishMessage = generator.generateWishMessage("Hi, N.K");
		System.out.println(wishMessage);	
		}

}
