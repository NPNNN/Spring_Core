package in.nkn.bean;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
   
	private Map<Integer,String> facultDetails;
	private Map<String,Date> dateInfo;
	
	private Properties technologies;
	
	static {
		System.out.println("UniversityInfo.class file is loading...");
	}

	
	
	public UniversityInfo(Map<Integer, String> facultDetails, Map<String, Date> dateInfo) {
		System.out.println("Zero param constructotr got called here...");
		this.facultDetails = facultDetails;
		this.dateInfo = dateInfo;
	}



	@Override
	public String toString() {
		return "UniversityInfo [facultDetails=" + facultDetails + ", dateInfo=" + dateInfo + ", technologies="
				+ technologies + "]";
	}



	
	
	
}
