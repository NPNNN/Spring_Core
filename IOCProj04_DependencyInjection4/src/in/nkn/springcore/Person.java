package in.nkn.springcore;

public class Person {
	
	private String pname;
	private Integer pid;
	private String paddress;
	private float income;
	
	static {
		System.out.println("Person.class file is loading....");
	}
	
	public  Person(){
		System.out.println("Person object in instantiated  using zero argument construtor....");
	}

	public void setPname(String pname) {
		this.pname = pname;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public void setIncome(float income) {
		this.income = income;
	}



	public Person(String pname, Integer pid, String paddress, float income) {
		System.out.println("Person object is created by Consturtor injection....");
		this.pname = pname;
		this.pid = pid;
		this.paddress = paddress;
		this.income = income;
	}



	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + ", paddress=" + paddress + ", income=" + income + "]";
	}
	
	

}
