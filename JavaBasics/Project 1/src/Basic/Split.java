package Basic;

public class Split {
public static void main(String[] args) {
	String A = "Vijay@Dinanath@Chouhan";
	String [] arrOfStr = A.split("@", 4);
	for (String C : arrOfStr)
	System.out.println(C);
}
}

