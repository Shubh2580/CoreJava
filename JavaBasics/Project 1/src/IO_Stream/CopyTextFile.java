package IO_Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
	public static void main(String[] args) throws IOException {
		String source = "D:/a.txt";
		String target = "D:/b.txt";
		FileReader reader = new FileReader(source);
		FileWriter writer= new FileWriter(target);
		
		int ch=reader.read();
		while (ch!=-1) {
			writer.write(ch);
			ch=reader.read();
		}
	writer.close();
	reader.close();
	System.out.println(source+ "is copied to" + target);
	}

	

}
