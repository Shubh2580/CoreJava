package Collection_Framework;

import java.util.Comparator;

public abstract class MarkSheet11 implements Comparator <MarkSheet11> {
	public String rollNo;

	public String name;

	public int marks;

	public MarkSheet11() {

	}

	public MarkSheet11(String rollNo, String name, int marks) {

		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
   public int compareTo(MarkSheet11 m) {
	   return rollNo.compareTo(m.rollNo);
   }
	public String toString() {

		return rollNo + "," + name + "," + marks;
	}

	@Override
	public int compare(MarkSheet11 m1, MarkSheet11 m2) {

		if (m1.marks > m2.marks) {

			return 1;

		} else if (m1.marks == m2.marks) {

			return 0;

		} else {

			return -1;
		}
	}}


