package in.nkn.bean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class College {

	private List<String> nameList;
	private List<Date> dateList;
	
	static {
		System.out.println("Collecge.class is loading...");
	}
	
	
	
	public College() {
		System.out.println("Object created using zero param constructor...");
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
		System.out.println(nameList.getClass());
	}
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "College [nameList=" + nameList + ", dateList=" + dateList + "]";
	}
	
	

		
	
	
	
}
