package IO_Stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadPD {
	public static void main(String[] args) throws IOException, Exception {
		FileInputStream F = new FileInputStream("D:\\a.txt");
		DataInputStream in = new DataInputStream(F);
		// System.out.println(in.readInt());
		 System.out.println(in.readDouble());
		//System.out.println(in.readChar());
		// System.out.println(in.readLine());
		in.close();

	}
}
