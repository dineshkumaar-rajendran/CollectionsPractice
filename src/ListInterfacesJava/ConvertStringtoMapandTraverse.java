package ListInterfacesJava;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ConvertStringtoMapandTraverse {

	public static void main(String[] args) {
		String strings = "DineshD";
		strings = strings.toUpperCase();
		strings = strings.replace(" ", "");
		char c[] = strings.toCharArray();
		int size = c.length;
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		for (int i = 0; i < size; i++) {
			if (!hmap.containsKey(c[i])) {
				hmap.put(c[i], 1);
			} else {
				int OldVal = hmap.get(c[i]);
				int NewVal = OldVal + 1;
				hmap.put(c[i], NewVal);
			}
		}

		// 1.iterator using keyset (keys)

		Iterator<Character> itr1 = hmap.keySet().iterator();
		while (itr1.hasNext()) {
			char key = itr1.next();
			int value = hmap.get(key);
			// System.out.println("The Key is " + key + " And The value is " + value);
		}

		// 2.iterator using entryset pairs
		Iterator<Map.Entry<Character, Integer>> itr2 = hmap.entrySet().iterator();
		while (itr2.hasNext()) {
			Map.Entry<Character, Integer> data = itr2.next();
			// System.out.println("The Key is " + data.getKey() + " And The value is " +
			// data.getValue());
		}

		// 3. ForEach loop with keyset()
		for (Character key : hmap.keySet()) {
			// System.out.println("The Key is " + key + " And The value is " +
			// hmap.get(key));
		}

		// 4.ForEach loop with entryset

		for (Map.Entry<Character, Integer> data : hmap.entrySet()) {
			//System.out.println("The Key is " + data.getKey() + " And The value is " + data.getValue());
		}
		
		//5.Lambda loop
		
		//hmap.keySet().stream().forEach(key -> System.out.println("The Key is " + key + " And The value is " + hmap.get(key)));
		
		//6.Streams
		
		Stream.of(hmap.keySet().toArray()).forEach(key -> System.out.println("The Key is " + key + " And The value is " + hmap.get(key)));
		
	}

}
