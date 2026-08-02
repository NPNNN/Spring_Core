package in.nkn.Test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nkn.bean.Flipcard;


public class ClientApp {

	public static void main(String[] args) {
		
	    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();	
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("in/nkn/cfg/applicationContext.xml");
	
	    Flipcard flipcard = factory.getBean("fpkt",Flipcard.class);
	    String shopping = flipcard.shopping(new String[] {"Realme","iPhone","Puma"}, new float[] {3600.5f,150000.0f,4000.0f});
	    System.out.println(shopping);
	}

}
