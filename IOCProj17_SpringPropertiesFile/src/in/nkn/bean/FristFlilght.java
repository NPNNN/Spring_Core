package in.nkn.bean;

public class FristFlilght implements Courier {

	static {
		System.out.println("FristFlight.class is loading....");
	}
	
	public FristFlilght () {
		System.out.println("FristFlight object is created....");
	}
	
	public String deliver(int oid) {
		System.out.println("FristFlight.deliver()");
		return "FristFlight courier will deliver order id :: "+oid + " order product";

	}

}
