package Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("india","new delhi");
		properties.put("usa","wd");
		properties.put("spain","madrid");
		properties.put("pakistan","islamabad");
		
		Set set = properties.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String string= (String) iterator.next();
			System.out.println(string+" "+ properties.getProperty(string));
			
		}
		String string2 = properties.getProperty("spain" ,"not found");
		System.out.println(string2);
		
		
	}

}
