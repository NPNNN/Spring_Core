package in.nkn.bean;

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
