package in.nkn.bean;

import java.util.Arrays;
import java.util.Date;

public class MarkInfo {
	
	private int marks[];
	private Date dates[];

	static {
		System.out.println("MarkInfo.class file is loading....");
	}
	
	

	public MarkInfo() {
		System.out.println("Object created using zero argu constructor injecton");
		
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
//		System.out.println(marks.getClass().getCanonicalName());
	}

	public void setDates(Date[] dates) {
		this.dates = dates;
	}




	@Override
	public String toString() {
		return "MarkInfo [marks=" + Arrays.toString(marks) + ", dates=" + Arrays.toString(dates) + "]";
	}
	
	
	

}
