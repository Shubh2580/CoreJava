package Basic_2;

public class Argument1 {
public static void main(String[] args) {
	if (args.length==2) {
		System.out.println(" Hello" + " "+args[0] + args[1]);
	}
	else {
		System.out.println("parameter name is required");
	}
}
}
