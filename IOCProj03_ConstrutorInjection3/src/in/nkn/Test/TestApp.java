package in.nkn.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.nkn.springcore.Employee;


public class TestApp {

	
	public static void main(String[] args) {
		
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");

		//Creating an IOC container
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		//Requesting IOC container to give the object searching will happen in cache and if it is not found then object will create
		//setter injection
        Employee employee = factory.getBean("emp",Employee.class);
		  

		//Using to target object performing the operation and printing the result
		System.out.println(employee);	
		
	}
}
