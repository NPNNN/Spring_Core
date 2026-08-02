package in.nkn.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import in.nkn.springcore.WishMessageGenerator;

public class ClientApp {

	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();	
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("in/nkn/cfg/applicationContext.xml");
	
		
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
