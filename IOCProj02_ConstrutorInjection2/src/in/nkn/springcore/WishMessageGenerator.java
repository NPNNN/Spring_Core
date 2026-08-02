package in.nkn.springcore;

import java.util.Date;

public class WishMessageGenerator {
	
	// Dependent class ----> PreDefined
	private Date date;
	  
	static {
		System.out.println("WishMessageGenerator.class file is loading.......");
	}
	
	
	public WishMessageGenerator() {
		System.out.println("Zero parameter consturtor called"+date);
	}


	public WishMessageGenerator(Date date) {
		System.out.println("Constructor injection is happening to inject date object....."+date);
		this.date = date;
	}
	
	
	//Setter Injection
	public void setDate(Date date) {
		System.out.println("Setter injection is happening to inject date object....."+date);
		this.date = date;
	}



	//Business logic to use Injected date in the Target class object
	public String generateWishMessage(String name)
	{
		System.out.println(date);
		@SuppressWarnings("deprecation")
		int hour=date.getHours();
		if(hour <=12)
			return "Hello :: "+name+" Good Morning";
		else if(hour <=16)
			return "Hello :: "+name+" Good Afternoon";
		else if(hour <=20)
			return "Hello :: "+name+" Good Evening";
		else
			return "Hello :: "+name+" Good Night";
		
	}
	
}
