package IO_Stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PrimitiveData {
public static void main(String[] args) throws Exception {
	FileOutputStream F= new FileOutputStream("D:/a.txt");
	DataOutputStream out = new DataOutputStream(F);
	out.writeInt('9');
	out.writeBoolean(true);
	out.writeDouble(10000.7);
	out.writeChar('A');
	out.close();
	F.close();
}
}
