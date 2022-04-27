package Basic_2;

public class Sample2 {
public static void sumDigits(double n) {
	int sum =0;
	while (n!=0) {
	sum += n%10;
	n/=10;
}
System.out.println(sum);
}
}
