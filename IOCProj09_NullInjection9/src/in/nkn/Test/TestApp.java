package in.nkn.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nkn.springcore.PersonInfo;





public class TestApp {
   
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();	
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("in/nkn/cfg/applicationContext.xml");
	    
	    PersonInfo per = factory.getBean("perl",PersonInfo.class);
	    System.out.println(per);
	    
	    System.out.println();
	    
	    PersonInfo per2 = factory.getBean("perl2",PersonInfo.class);
	    System.out.println(per2);
	}
}
