package bean;


public class Address {
	private String Hno;
	private String Loc;
	
	public String getHno() {
		return Hno;
	}
	public void setHno(String hno) {
		Hno = hno;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
	
	public String toString()
	{
		return Hno + "\t" + Loc;
	}
}
