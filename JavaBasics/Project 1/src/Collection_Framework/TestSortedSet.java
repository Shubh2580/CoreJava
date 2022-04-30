package Collection_Framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("One");
		s.add("Two");
		s.add("Three");
		for (Object ele : s) {
			System.out.println(ele);
		}
		System.out.println("First number is : " + s.first());
		System.out.println("Last number is : " + s.last());

	}

}
