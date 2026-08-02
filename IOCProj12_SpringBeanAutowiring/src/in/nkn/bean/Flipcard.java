package in.nkn.bean;

import java.util.Arrays;
import java.util.Random;

//Target objecct
public class Flipcard {
    
	//Dependent object
	private Courier courier;
	
	static {
		System.out.println("Flipcard.class file is loading...");
	}
	
	public Flipcard() {
		System.out.println("Flipcard object is created....");
	}
	
	//Constructor injection
	public Flipcard(Courier courier) {
		System.out.println("Courier object is injected through construtor....");
		this.courier = courier;
	}

	 
    //Setter injection 
	public void setCourier(Courier courier) {
		System.out.println("Courier object is injected through setter....");
		this.courier = courier;
	}

    //Business logic
	public String shopping(String[] items,float[] prices) {
		System.out.println(courier.getClass().getName());
		 Random random=null;
		float billAmt=0.0f;
		int oid=0;
		for(float price : prices) {
			billAmt +=price;
		}
		random = new Random();
		oid=random.nextInt(1000);
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items)+"are purchase haiving price"+Arrays.toString(prices)
		       +"with the bill amount ::"+billAmt+"----->"+msg;
	}  
}
