package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersongetterQue {
	
	
public static void main(String[] args) throws ParseException {
	Person per= new Person();
	per.setPerName("Vishal");
	per.setPerAddress("Indore");
	
	Date d = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	String dd = sdf.format(d);
	
     String s= "24/04/1997";
     Date dt = sdf.parse(s);
     
     per.setPerDob(dt);
	System.out.println(per.toString());
}
}
