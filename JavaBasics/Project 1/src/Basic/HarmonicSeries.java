package Basic;

public class HarmonicSeries {
public static void main(String[] args) {
	double n=10, i;
	double sum=0;
	for (i=1; i<=n; i++)
{
	sum=sum+(float)1/i;
}
System.out.println("nSum=" +sum);
}

}
