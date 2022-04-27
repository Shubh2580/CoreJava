package Collection_Framework;

public class Customer implements Cloneable {
public String name= null;
public BankAccount account = null;

public Customer (String n) {
	name =n;
	account= new BankAccount(10000); }
	public Object clone() throws CloneNotSupportedException{
		Customer c= (Customer) super.clone();
		c.account= (BankAccount)account.clone();
		return c;
	}
}

