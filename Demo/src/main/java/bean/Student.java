package bean;

public class Student {
	private String sname;
	private String course;
	private Float fees;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Float getFees() {
		return fees;
	}
	public void setFees(Float fees) {
		this.fees = fees;
	}
	
	public void printdetails()
	{
		System.out.println(sname + "\t" + course + "\t" + fees);
	}
}
