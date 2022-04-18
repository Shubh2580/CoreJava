package Basic;

public class MD {
	public static void main(String[] args) {
	int [] [] tables = new int [5] [2]; 
	
		 tables [0] [0] = 2; tables [1] [0] = 4; tables [2] [0] = 6; tables [3] [0] =
		  8; tables [4] [0] = 10;
	 
		  tables [0] [1] = 3; tables [1] [1] = 6; tables [2] [1] = 9;
	
	for (int row=0; row <tables.length; row++) {
    for (int col=0; col<tables[0].length; col++) {
    	System.out.print(tables[row] [col] + "\t");
    }
    System.out.println();
	}

}
}
	