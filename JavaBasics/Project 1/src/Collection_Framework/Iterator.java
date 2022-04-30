package Collection_Framework;

import java.util.ArrayList;

public class Iterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			al.add(i);
			System.out.println(al);
		}
		java.util.Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			System.out.print(i + " ");

			if (i % 2 != 0) {
				itr.remove();
				System.out.println();
				System.out.print(al);
			}

		}

	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public char[] next() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

