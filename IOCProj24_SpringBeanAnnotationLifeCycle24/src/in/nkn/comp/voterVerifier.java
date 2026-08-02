package in.nkn.comp;

import java.util.Date;



//Come from JDK 9 not from Spring
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="in/nkn/commons/input.properties")
public class voterVerifier {
  
	@Value("${voterVerifier.name}")
	private String name;
	
	@Value("${voterVerifier.age}")
	private float age;
	
	static {
		System.out.println("voterVerifier.class file is loading...");
	}
	
	public voterVerifier() {
		
		System.out.println("voterVerifier object is instantiated...");
	}
	private Date DateVerification;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public Date getDateVerification() {
		return DateVerification;
	}

	public void setDateVerification(Date dateVerification) {
		DateVerification = dateVerification;
	}

	@PostConstruct
	public void outInit() {
		System.out.println("voterVerifier.outInit()::custom init method...");
		DateVerification = new Date();
		if(name == null || age<0)
			throw new IllegalArgumentException("Invalid input are given fro the name.age properties of a bean");
	}
	
	public String checkEligibility() {
		if(age>18) {
			return "Mr/Miss/Mrs " +name+"u r eligible for voting...Do not Wait on --->"+DateVerification;	
		}
		else {
			return "Mr/Miss/Mrs" +name+"u r not eligible for voting...Wait"+(18-age)+"year to cast ur vote on --->"+DateVerification;
		}
	}
	
	@PreDestroy
	public void ourDestroy() {
		System.out.println("voterVerifier.ourDestroy::custom destroy method...");
	    
		//nullyfy bean properties
		name=null;
	    age=0.0f;
	    DateVerification=null;
	}
	@Override
	public String toString() {
		return "voterVerifier [name=" + name + ", age=" + age + ", DateVerification=" + DateVerification + "]";
	}
	
	
	
	
}
