package in.nkn.springcore;

import java.util.Date;

public class WishMessageGenerator {
	
	// Dependant class ----> Pre Defined
	private Date date;
	  
	static {
		System.out.println("WishMessageGenerator.class file is loading.......");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is instantiated...");
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	//Business logic to use Injected date in the Target class object
	
	public String generateWishMessage(String name)
	{
		//System.out.println(date);
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
