package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
public class GFG {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		 al.add("Jack");
		 al.add("Tyler");
		 al.add("Richard");
		 Iterator itr = (Iterator) al.iterator();
		 while (itr.hasNext()){
			 Object o= itr.next();
			 System.out.println(o);
		 
			 }
		}
	}
	


