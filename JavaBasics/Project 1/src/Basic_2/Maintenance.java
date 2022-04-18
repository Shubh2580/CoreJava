package Basic_2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Maintenance {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		for (int i = 0; i <= 12; i++) {

			cal.add(Calendar.DATE, 30);

			Date next = cal.getTime();

			System.out.println(next);

		}
	}
}
