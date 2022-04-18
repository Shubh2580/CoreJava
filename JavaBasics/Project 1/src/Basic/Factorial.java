package Basic;

public class Factorial {
public static void main(String[] args) {
	int a = 5;
	long factorial = 1;
	for (int i=1; i<=a; i++)
	{
		factorial *=i;
	}
	System.out.printf("Factorial of %d= %d", a, factorial);
}
}
