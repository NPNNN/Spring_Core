package in.nkn.main;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nkn.bean.College;
import in.nkn.bean.ConstructorInfo;
import in.nkn.bean.MarkInfo;
import in.nkn.bean.UniversityInfo;



public class ClientApp {

	public static void main(String[] args) {
		
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();	
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("in/nkn/cfg/applicationContext.xml");
	     
	    //Array object is injected
		
		  MarkInfo markinfo = factory.getBean("marksInfo",MarkInfo.class);
		  System.out.println(markinfo);
		   
		  System.out.println();
	    
	    //List  object is injected
		
		  College college = factory.getBean("college",College.class);
		  System.out.println(college);
		  
		  System.out.println();
		 
	      
	      //Set object is injected
	       ConstructorInfo info = factory.getBean("cinfo",ConstructorInfo.class);
	        System.out.println(info);
	        
	        System.out.println();
	       //Map object is injected
	        UniversityInfo uinfo = factory.getBean("university",UniversityInfo.class);
	        System.out.println(uinfo);
	}

}
