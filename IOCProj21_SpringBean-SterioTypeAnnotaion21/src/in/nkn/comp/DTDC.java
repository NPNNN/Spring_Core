package in.nkn.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "dtdc")
//@Scope(scopeName = "prototype")
public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class is loading....");
	}
	public DTDC() {
		System.err.println("DTDC object is created....");
	}
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC courier will deliver order id :: "+oid + " order product";

	}

}
