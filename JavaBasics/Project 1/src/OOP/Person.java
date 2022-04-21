package OOP;

import java.util.Date;

public class Person {
	private String PerName;
	private Date PerDob;
	private String PerAddress;
	public static final int PER_AVG_AGE= 25;

	public String getPerName() {
		return PerName;
	}

	public void setPerName(final String PerName) {
		this.PerName = PerName;
	}

	public String getPerAddress() {
		return PerAddress;
	}

	public void setPerAddress(final String PerAddress) {
		this.PerAddress = PerAddress;
	}

	
	public static int getPerAvgAge() {
		return PER_AVG_AGE;
	}

	public Date getPerDob() {
		return PerDob;
	}

	public void setPerDob(Date d) {
		this.PerDob = d;
	}

	public String toString() {
		String str = "Person:[Name=" + getPerName() + ",Dob=" + getPerDob() + ", Address= " + getPerAddress()
				+ ", AVG_AGE= " + getPerAvgAge()+ "]";
		return str;
	}

	
}
