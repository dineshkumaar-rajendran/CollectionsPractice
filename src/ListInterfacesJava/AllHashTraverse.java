package ListInterfacesJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class AllHashTraverse {

	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("Dinesh", "India");
		hmap.put("John", "UK");
		hmap.put("Warner", "AUS");
		hmap.put("Williamson", "NZ");

		// 1. iterate over the keys using the iterator

		Iterator<String> itr = hmap.keySet().iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			String value = hmap.get(key);
			// System.out.println("Key is "+key+":"+"Value"+value);
		}

		// 2. iterate over over entryset(pair) using iterator

		Iterator<Map.Entry<String, String>> itr1 = hmap.entrySet().iterator();

		while (itr1.hasNext()) {
			Map.Entry<String, String> entry = itr1.next();
			// System.out.println("Key is a "+entry.getKey()+":"+"Value is a
			// "+entry.getValue());
		}

		// 3. iterate over foreachloop with pairs entryset

		for (Map.Entry<String, String> data : hmap.entrySet()) {
			String key = data.getKey();
			String value = data.getValue();
			// System.out.println("Key is a " + data.getKey() + ":" + "Value is a" +
			// data.getValue());
		}

		// 4. iterate over foreachloop with pairs keyset

		for (String key : hmap.keySet()) {
			// System.out.println("Key is " + key + " Value is " + hmap.get(key));
		}

		// 5.iterate over foreachloop

		hmap.keySet().stream().forEach(key -> System.out.println(key + " " + hmap.get(key)));

		Stream.of(hmap.keySet().toArray()).forEach(key -> System.out.println(key + " " + hmap.get(key)));

	}
}
