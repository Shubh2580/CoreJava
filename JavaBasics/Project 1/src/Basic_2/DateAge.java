package Basic_2;

import java.time.LocalDate;
import java.time.Period;

public class DateAge {
public static void main(String[] args) {
	LocalDate Today = LocalDate.now();
	LocalDate Birthday= LocalDate.of(1984, 12, 24);
	Period period= Period.between(Birthday, Today);
	System.out.println(period.getYears());
	System.out.println(period.getMonths());
	System.out.println(period.getDays());


}
}
