package in.nkn.Test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.FileSystemResource;

import in.nkn.springcore.WishMessageGenerator;

public class TestApp {

	
	public static void main(String[] args) {
		
		//using the FileSystemResource to locate the configuration file
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");

		//Creating an IOC container
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		//Requesting IOC container to give the object,searching will happen in cache and if it is not available
        //Object will created by loading and performing setter injection
		//Object object = factory.getBean("wmg");
        //WishMessageGenerator generator = (WishMessageGenerator) object;
		 
		//Above 2 line we can write in one line
		WishMessageGenerator generator1 = (WishMessageGenerator) factory.getBean("wmg");
		  
         //Searching will happen in cache, it is found so get it form cache only
		WishMessageGenerator generator2 = (WishMessageGenerator) factory.getBean("wmg");
		
		System.out.println("Generator1 class objecct reference :: "+generator1.hashCode());
		System.out.println("Generator2 class objecct reference :: "+generator2.hashCode());
		
		System.out.println();
		
		//Using to target object performing the operation and printing the result
		String wishMessage = generator1.generateWishMessage("Hi, N.K");
		System.out.println(wishMessage);	
		}

}
