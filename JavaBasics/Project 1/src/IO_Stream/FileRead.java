
package IO_Stream;

	import java.io.FileWriter;
	import java.io.PrintWriter;
	public class FileRead {
	public static void main(String[] args) throws Exception {
		FileWriter writer= new FileWriter("D:\\my books\\Airport1.txt");
		PrintWriter pw= new PrintWriter(writer);
		for (int i=0; i<5; i++) {
			pw.println(i+ ": Line");
		}
		pw.close();
		writer.close();
		
	}
	}
