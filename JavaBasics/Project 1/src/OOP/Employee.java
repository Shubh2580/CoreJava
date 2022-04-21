package OOP;

public class Employee {
private int eId;
private String eName;
private String eDesignation;
private String eCompany;
public void setEmpId(final int eId) {
	this.eId=eId;
}

public int getEmpId() {
return eId;}

public String getEmpName() {
	return eName;}
public void setEmpName (final String eName)
{ if (eName==null || eName.length() <=0) {
	throw new IllegalArgumentException();}
	this.eName = eName;
	}
public String getEmpDesignation ()
{ 
	return eDesignation;
}

public void setEmpDesignation(final String eDesignation) {
	this.eDesignation=eDesignation;
}
public String getEmpCompany() {
	return eCompany;}
public void setEmpCompany(final String eCompany) {
	this.eCompany= eCompany;}
@Override
public String toString() {
	String str="Employee:[Id="+getEmpId()+",Name="+getEmpName()+", Designation="+getEmpDesignation()+", Company="+getEmpCompany()+"]";
return str;
}}







