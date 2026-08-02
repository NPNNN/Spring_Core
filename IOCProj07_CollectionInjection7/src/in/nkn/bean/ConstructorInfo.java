package in.nkn.bean;

import java.util.Date;
import java.util.Set;

public class ConstructorInfo {
	
	private Set<Long> phoneNumber;
	private Set<Date> dates;
	
	static {
		System.out.println("ConstructorInfo.class file is loading...");
	}
	public ConstructorInfo(Set<Long> phoneNumber, Set<Date> dates) {
		System.out.println("Zero Argument constructor got call here" + this.getClass());
		this.phoneNumber = phoneNumber;
		this.dates = dates;
		System.out.println(phoneNumber.getClass());
	}

	@Override
	public String toString() {
		return "ConstructorInfo [phoneNumber=" + phoneNumber + ", dates=" + dates + "]";
	}
	
	
	
	

}
