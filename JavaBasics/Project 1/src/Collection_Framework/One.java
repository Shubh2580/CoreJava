package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class One {
	TreeSet s = new TreeSet();
	{
		s.add("Zero");

		s.add("One");
		s.add("Three");
		s.add("Two");
}
	{
	Iterator it= s.iterator();
	while (it.hasNext()) {
		String str = (String) it.next();
		System.out.println(str);
	}
}}
