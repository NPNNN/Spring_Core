package in.nkn.bean;

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
