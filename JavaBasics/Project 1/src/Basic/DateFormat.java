package Basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
public static void main(String[] args) {
	Date today = new Date();
	SimpleDateFormat sdf1= new SimpleDateFormat ("dd/MMM/YYYY");
	String strDate= sdf1.format (today);
	System.out.println(strDate);
}
}