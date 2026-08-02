package in.nkn.Test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nkn.target.Flipcard;


public class ClientApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("in/nkn/cfg/applicationContext.xml");
		
		
	    Flipcard flipcard = applicationContext.getBean("fpkt",Flipcard.class);
	    String shopping = flipcard.shopping(new String[] {"Realme","iPhone","Puma"}, new float[] {3600.5f,150000.0f,4000.0f});
	    System.out.println(shopping);
	}

}
