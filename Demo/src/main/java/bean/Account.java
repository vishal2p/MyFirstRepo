package bean;

public class Account {
	private String accName;
	private String accType;
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public String toString()
	{
		return accName + "\t" + accType;
	}
	
}
