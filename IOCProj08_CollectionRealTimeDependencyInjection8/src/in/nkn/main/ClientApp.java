package in.nkn.main;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.nkn.controller.MainController;
import in.nkn.vo.CustomerVo;

public class ClientApp {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the customerName :: ");
		String customerName=scanner.next();
		
		System.out.println("Enter the customerAddr :: ");
		String customerAddress=scanner.next();
		
		System.out.println("Enter the Principal Amount :: ");
		String pamount=scanner.next();
		
		System.out.println("Enter the Time period :: ");
		String time=scanner.next();
		
		System.out.println("Enter the Rate of Interest :: ");
		String rate=scanner.next();
		
		CustomerVo vo = new CustomerVo();
		vo.setCustomerAddress(customerAddress);
		vo.setCustomerName(customerName);
		vo.setPamt(pamount);
		vo.setRate(rate);
		vo.setTime(time);
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();	
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("in/nkn/cfg/applicationContext.xml");
	
	 MainController controller=factory.getBean("controller", MainController.class);
     //String result = controller.processResult(vo);
     System.out.println(controller.processResult(vo));
	
	}

}
