package in.nkn.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="bDart")
//@Scope(scopeName = "prototype")
public class BlueDart implements Courier {

	static {
		System.out.println("BlueDart.class file is loading.....");
	}
	public BlueDart() {
		System.out.println("BlueDart object is instantiated....");
	}
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart courier will deliver order id :: "+oid + " order product";
	}

}
