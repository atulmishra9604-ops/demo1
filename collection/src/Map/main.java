package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class main {
public static void main(String[] args) {
	Map<Integer, String>map=  new HashMap<Integer, String>();
	
	map.put(1, "atul");
	map.put(2, "raj");
	map.put(3, "sahil");
	map.put(4, " reema");
	
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());
	System.out.println(map.containsKey(1));
	
	Set set  = map.entrySet();
	Iterator iterator= set.iterator();
	while (iterator.hasNext()) {
		Map.Entry<Integer, String> entry= (Map.Entry<Integer, String>)iterator.next();
		System.out.println(entry.getKey()+ "  "+entry.getValue());
	}
	
}
}
