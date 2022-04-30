package IO_Stream;

import java.io.File;

public class DisplayFile {
public static void main(String[] args) {
	File directory = new File("C:\\Users\\Shubham Geete\\Desktop\\Desktop Files\\oyo");
	File[] f = directory.listFiles();
	for (int i=0; i< f.length; i++) {
		if(f[i].isFile()) {
		System.out.println((i+1) + " : " + f[i].getName());
	}
}}
}
