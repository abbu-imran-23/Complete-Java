/* 	### Map ###
	1. HashMap
	2. LinkedHashMap
	3. TreeMap
	4. WeakHashMap
	5. IdentityHashMap
	6. EnumMap 
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		
		/* HashMap
		   Duplicate values not allowed
		   Does not preserve insertion order
		   Stores heterogeneous elements - [10, null, "Java"]
		   Default size - 16
		*/
		System.out.println("------------- HashMap ---------------");
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		System.out.println(hmap.size()); // 0
		hmap.put(1, "Java");
		hmap.put(3, "C++");
		hmap.put(2, "Javascript");
		hmap.put(1, "Java");
		hmap.put(3, "C#");
		System.out.println(hmap.size()); // 3
		System.out.println(hmap); // {1=Java, 2=Javascript, 3=C#}
		System.out.println(hmap.containsKey(2)); // true
		System.out.println(hmap.containsValue("C++")); // false
		System.out.println(hmap.get(2)); // Javascript
		
		// KeySet
		for(Integer key: hmap.keySet()) {
			System.out.println("Key " + key); // 1, 2, 3
		}
		
		// ValueSet
		for(String value: hmap.values()) {
			System.out.println("Value " + value); // Java, Javascript, C#
		}
		
		// EntrySet
		for(Map.Entry<Integer, String> mp : hmap.entrySet()) {
			System.out.println(mp.getKey() + " -> " + mp.getValue());
		}
		
		
		/* LinkedHashMap
		   Duplicate values not allowed
		   Preserves insertion order
		   Stores heterogeneous elements - [10, null, "Java"]
		*/
		System.out.println("------------- LinkedHashMap ---------------");
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
		System.out.println(lhmap.size()); // 0
		lhmap.put(1, "Java");
		lhmap.put(3, "C++");
		lhmap.put(2, "Javascript");
		lhmap.put(1, "Java");
		lhmap.put(3, "C#");
		System.out.println(lhmap.size()); // 3
		System.out.println(lhmap); // {1=Java, 3=C#, 2=Javascript}
		System.out.println(lhmap.containsKey(2)); // true
		System.out.println(lhmap.containsValue("C++")); // false
		System.out.println(lhmap.get(2)); // Javascript
		
		// KeySet
		for(Integer key: lhmap.keySet()) {
			System.out.println("Key " + key); // 1, 3, 2
		}
		
		// ValueSet
		for(String value: lhmap.values()) {
			System.out.println("Value " + value); // Java, C#, Javascript
		}
		
		// EntrySet
		for(Map.Entry<Integer, String> mp : lhmap.entrySet()) {
			System.out.println(mp.getKey() + " -> " + mp.getValue());
		}
		
		
		/* TreeMap
		   Duplicate values not allowed
		   Sorts the map according to the keys
		   Stores heterogeneous elements - [10, null, "Java"]
		*/
		System.out.println("------------- TreeMap ---------------");
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		System.out.println(tmap.size()); // 0
		tmap.put(1, "Java");
		tmap.put(3, "C++");
		tmap.put(2, "Javascript");
		tmap.put(4, "C++");
		tmap.put(1, "Java");
		tmap.put(3, "C#");
		System.out.println(tmap.size()); // 3
		System.out.println(tmap); // {1=Java, 2=Javascript, 3=C#, 4=C++}
		System.out.println(tmap.containsKey(2)); // true
		System.out.println(tmap.containsValue("C++")); // false
		System.out.println(tmap.get(2)); // Javascript
		
		// KeySet
		for(Integer key: tmap.keySet()) {
			System.out.println("Key " + key); // 1, 2, 3, 4
		}
		
		// ValueSet
		for(String value: tmap.values()) {
			System.out.println("Value " + value); // Java, Javascript, C#, C++
		}
		
		// EntrySet
		for(Map.Entry<Integer, String> mp : tmap.entrySet()) {
			System.out.println(mp.getKey() + " -> " + mp.getValue());
		}
		
	}
}