package Basic;

public class OddEven {
public static void main(String[] args) {
	int n= 100;
	int evenCount=0, oddCount=0, evenSum=0, oddSum=0;
	while (n>0) {
		if (n%2==0) {
			evenCount++;
			evenSum= evenSum + n;
		} else {
			oddCount++;
			oddSum = oddSum + n;
		}
		n--;
	}
	int avgEven, avgOdd;
	avgEven= evenSum/ evenCount;
	avgOdd = oddSum/ oddCount;
	System.out.println("avg of Even no is:" + avgEven);
	System.out.println("avg of Odd no is:" + avgOdd);
		}
}