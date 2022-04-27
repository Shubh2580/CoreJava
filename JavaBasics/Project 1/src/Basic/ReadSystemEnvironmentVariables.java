package Basic;

import java.util.Map;
import java.util.Set;

public class ReadSystemEnvironmentVariables {
public static void main(String[] args) {
	String path= System.getenv("PATH");
	System.out.println("$PATH=" + path);
	Map<String, String> envMap= System.getenv();
	Set<String> keyset=envMap.keySet();
	for (String key:keyset) {
		String val= envMap.get(key);
		System.out.println(key+ "=" + val);
	}




}
}
