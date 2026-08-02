package in.nkn.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nkn.springcore.Car;


public class TestApp {
   
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();	
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("in/nkn/cfg/applicationContext.xml");
	    
	    Car car1 = factory.getBean("car1",Car.class);
	    System.out.println(car1);
	    
	    System.out.println();
	    
	    Car car2 = factory.getBean("car2",Car.class);
	    System.out.println(car2);
	    
	    System.out.println();
	    
	    //if you enable this this will give error because i have declared this as a abstract in the xml fille
		/*
		 * Car car3 = factory.getBean("baseClass",Car.class); System.out.println(car3);
		 */
	}
}
