package ListInterfacesJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {

		/*
		 * No order of elements stores as key and value keys cant be duplicate can store
		 * multiple null values and one null key
		 */

		Map<String, String> Capitals = new HashMap<String, String>();
		Capitals.put("India", "NewDelhi");
		Capitals.put("Canada", "Ottawa");
		Capitals.put("USA", "Washington");
		Capitals.put("Russia", "Moscow");
		Capitals.put(null, null);
		Capitals.put(null, "Dhaka");

		// System.out.println(Capitals);

		Iterator<String> itr = Capitals.keySet().iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			String value = Capitals.get(key);
			// System.out.println(key + " " + value);
		}
		Iterator<Entry<String, String>> itr1 = Capitals.entrySet().iterator();

		while (itr1.hasNext()) {
			Entry<String, String> entry = itr1.next();
			// System.out.println("Get Key = "+entry.getKey()+" Get Key =
			// "+entry.getValue());
		}

		for (Map.Entry<String, String> data : Capitals.entrySet()) {
			// System.out.println("Key ="+data.getKey());
			// System.out.println("Value ="+data.getValue());
		}

	}
}
