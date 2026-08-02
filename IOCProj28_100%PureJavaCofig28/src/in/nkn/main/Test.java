package in.nkn.main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.nkn.cfg.AppConfig;
import in.nkn.comp.WishMessageGenerator;

public class Test {

	public static void main(String[] args) throws IOException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    System.out.println("************Container Started***********");
	    
	    System.in.read();
	     
	    WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
	    System.out.println(wmg);
	    
	    String msg=wmg.greetMessage(" Shreyash");
	    System.out.println(msg);
	    context.close();
	    
	    System.out.println("************Container Close***********");
	    
	    
	}
	
}
