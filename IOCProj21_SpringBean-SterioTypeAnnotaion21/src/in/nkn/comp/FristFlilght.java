package in.nkn.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "fFlight")
//@Scope("prototype")
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
