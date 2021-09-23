package bean;

public class Employee {
	private String empName;
	private Address eaddrs;
	private Account eacc;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getEaddrs() {
		return eaddrs;
	}
	public void setEaddrs(Address eaddrs) {
		this.eaddrs = eaddrs;
	}
	public Account getEacc() {
		return eacc;
	}
	public void setEacc(Account eacc) {
		this.eacc = eacc;
	}
	
	public void printValues()
	{
		System.out.println(empName + "\t" + eaddrs + "\t" + eacc);
	}
}
