/* 	### Set ###
	1. HashSet
	2. LinkedHashSet
	3. TreeSet
	4. EnumSet 
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		
		/* HashSet
		   Duplicate values not allowed
		   Does not preserve insertion order
		   Stores heterogeneous elements - [10, null, "Java"]
		*/
		System.out.println("------------- HashSet ---------------");
		HashSet<Integer> hset = new HashSet<Integer>();
		System.out.println(hset.size()); // 0
		hset.add(10);
		hset.add(30);
		hset.add(10);
		hset.add(20);
		System.out.println(hset.size()); // 3
//		Collections.sort(hset); - not applicable
		System.out.println(hset); // [20, 10, 30]
		hset.remove(10);
		System.out.println(hset); // [20, 30]
		System.out.println(hset.contains(30)); // true
		System.out.println(hset.isEmpty()); // false
		
		for(Integer num : hset) {
			System.out.println("Printing set element " + num);
		}
		Iterator hsetItr = hset.iterator();
		while(hsetItr.hasNext()) {
			System.out.println("Printing set element " + hsetItr.next());
		}
		hset.clear(); // clears set
		System.out.println(hset.size()); // 0
		
		
		/* LinkedHashSet
		   Duplicate values not allowed
		   Preserves insertion order
		   Stores heterogeneous elements - [10, null, "Java"]
		*/
		System.out.println("------------- Linked HashSet ---------------");
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
		System.out.println(lhset.size()); // 0
		lhset.add(10);
		lhset.add(30);
		lhset.add(10);
		lhset.add(20);
		System.out.println(lhset.size()); // 3
//		Collections.sort(lhset); - not applicable
		System.out.println(lhset); // [10, 30, 20]
		lhset.remove(10);
		System.out.println(lhset); // [30, 20]
		System.out.println(lhset.contains(30)); // true
		System.out.println(lhset.isEmpty()); // false
		
		for(Integer num : lhset) {
			System.out.println("Printing set element " + num);
		}
		Iterator lhsetItr = lhset.iterator();
		while(lhsetItr.hasNext()) {
			System.out.println("Printing set element " + lhsetItr.next());
		}
		lhset.clear(); // clears set
		System.out.println(lhset.size()); // 0
		
		
		/* TreeSet
		   Duplicate values not allowed
		   Sorts the set
		   Stores only Homogeneous elements
		*/
		System.out.println("------------- TreeSet ---------------");
		TreeSet<Integer> tset = new TreeSet<Integer>();
		System.out.println(tset.size()); // 0
		tset.add(10);
		tset.add(30);
		tset.add(10);
		tset.add(20);
		System.out.println(tset.size()); // 3
		System.out.println(tset); // [10, 20, 30]
		tset.remove(10);
		System.out.println(tset); // [20, 30]
		System.out.println(tset.contains(30)); // true
		System.out.println(tset.isEmpty()); // false
		
		for(Integer num : tset) {
			System.out.println("Printing set element " + num);
		}
		Iterator tsetItr = tset.iterator();
		while(tsetItr.hasNext()) {
			System.out.println("Printing set element " + tsetItr.next());
		}
		tset.clear(); // clears set
		System.out.println(tset.size()); // 0
		
	}
}
