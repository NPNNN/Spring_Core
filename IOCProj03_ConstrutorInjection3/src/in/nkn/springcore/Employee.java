package in.nkn.springcore;

public class Employee {
     private Integer eno;
     private String ename;
     private float esalary;
     private String eaddress;
	 public Employee(Integer eno, String ename, float esalary, String eaddress) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
		this.eaddress = eaddress;
	 }
	 @Override
	 public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress + "]";
	 }
     
     
}
