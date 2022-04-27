package Collection_Framework;

public class TestDeepCloning {
public static void main(String[] args) throws Exception {
	Customer c1 = new Customer ("Ram");
	Customer c2 = (Customer) c1.clone();
	c2.name= "Balram";
	c2.account.balance= 20000;
	System.out.println("Original");
	System.out.println("Name : " + c1.name);
    System.out.println("Balance : "+ c1.account.balance);	
    System.out.println("Cloned");
    System.out.println("Name : " + c2.name);
    System.out.println("Balance : " + c2.account.balance);


}
}
