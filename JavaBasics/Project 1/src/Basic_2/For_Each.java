package Basic_2;

public class For_Each {
public static void main(String[] args) {
	int[] marks= {125, 132, 95, 116, 110};
	int highest_marks= maximum(marks);
	System.out.println("Highest score is : " + highest_marks);
}
public static int maximum (int[] numbers) {
	int maxSoFar= numbers[0];
	for (int num: numbers)
	{
	if (num> maxSoFar)
	{ maxSoFar=num;}}
	return maxSoFar;
	}}
