package Collection_Ex;
import java.util.Comparator;
public class Que_2 {
	public class Employe implements Comparable<Employe> {

		public String Fname;
		public String Lname;
		public int salary;

		public Employe() {
		}

		public Employe(String s, String y, int i) {
			this.Fname = s;
			this.Lname = y;
			this.salary = i;

}

		public int compareTo(Employe o1) {

	return Fname.compareTo(o1.Fname);

}

		public String toString() {
		return Fname + " " + Lname + " ," + salary;
	}
	}
}
