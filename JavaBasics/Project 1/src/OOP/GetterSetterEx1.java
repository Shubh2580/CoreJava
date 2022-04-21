package OOP;

public class GetterSetterEx1 {
public static void main(String[] args) {
	final Employee emp= new Employee();
	emp.setEmpId(107);
	emp.setEmpName("Rakesh");
	emp.setEmpDesignation("Software Engineer");
	emp.setEmpCompany("Amazon");
	System.out.println(emp.toString());
}
}
