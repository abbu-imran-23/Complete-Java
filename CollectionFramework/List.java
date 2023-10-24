/*	### List ###
	1. ArrayList
	2. LinkedList
	3. Stack
	4. Vector 
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class List {
	public static void main(String[] args) {
		
		/* ArrayList
		   InitialCapacity = 10
		   Increases its capacity by - currentCapacity * 3/2 + 1 
		   ArrayList<Integer> arrList = new ArrayList<Integer>(40); -> In this case, it does not increases its capacity until its filled
		   
		   Preserves Insertion order
		   Affects performance if the requirement has frequent addition and deletion operations
		   Good for sorting and searching
		   Stores heterogeneous elements - [10, null, "Java"]
		   Duplicates allowed
		*/
		System.out.println("------------- ArrayList ---------------");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		System.out.println(arrList.size()); // 0
		arrList.add(10); // [10]
		arrList.add(30); // [10, 30]
		arrList.add(20); // [10, 30, 20]
		System.out.println(arrList.size()); // 3
		System.out.println(arrList); // [10, 30, 20]
		Collections.sort(arrList, Comparator.reverseOrder()); // Sorts list in descending order
		System.out.println(arrList); // [30, 20, 10]
		Collections.sort(arrList); // Sorts list in ascending order
		System.out.println(arrList); // [10, 20, 30]
		System.out.println(arrList.get(1)); // 20
		System.out.println(arrList.remove(1)); 
		System.out.println(arrList); // [10, 30]
		System.out.println(arrList.remove(Integer.valueOf(10))); // Removes Value
		System.out.println(arrList); // [30]
		arrList.add(0, 10); // [10, 30]
		arrList.add(1, 20); // [10, 20, 30]
		System.out.println(arrList); // [10, 20, 30]
		arrList.set(1, 200); // updates the index 1's value 
		System.out.println(arrList); // [10, 200, 30]
		System.out.println(arrList.contains(200)); // true
		
		for(Integer num : arrList) {
			System.out.println(num);
		}
		
		Iterator<Integer> it = arrList.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator " + it.next());
		}
		arrList.clear(); // Removes all of the elements from this list.
		System.out.println("Cleared " + arrList.size()); // 0
		
		
		/* LinkedList
		   Preserves Insertion order
		   Good use case for the requirement having frequent addition and deletion operations
		   Not Good for sorting and searching
		   Stores heterogeneous elements - [10, null, "Java"]
		   Duplicates allowed
		*/
		System.out.println("------------- LinkedList ---------------");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		System.out.println(linkedList.size()); // 0
		linkedList.add(10); // [10]
		linkedList.add(30); // [10, 30]
		linkedList.add(20); // [10, 30, 20]
		System.out.println(linkedList.size()); // 3
		System.out.println(linkedList); // // [10, 30, 20]
		Collections.sort(linkedList); // Sorts list
		System.out.println(linkedList); // [10, 20, 30]
		System.out.println(linkedList.get(1)); // 20
		System.out.println(linkedList.remove(1)); // Removes 1st index value
		System.out.println(linkedList); // [10, 30]
		System.out.println(linkedList.remove(Integer.valueOf(10))); // Removes Value
		System.out.println(linkedList); // [30]
		linkedList.add(0, 10); // [10, 30]
		linkedList.add(1, 20); // [10, 20, 30]
		System.out.println(linkedList); // [10, 20, 30]
		linkedList.set(1, 200); // updates the index 1's value 
		System.out.println(linkedList); // [10, 200, 30]
		System.out.println(linkedList.contains(200)); // true
		linkedList.addFirst(99);
		System.out.println(linkedList); // [99, 10, 200, 30]
		linkedList.addLast(50);
		linkedList.add(40);
		System.out.println(linkedList); // [99, 10, 200, 30, 50, 40]
		System.out.println(linkedList.getFirst()); // 99
		System.out.println(linkedList.getLast()); // 40
		
		for(Integer num : linkedList) {
			System.out.println(num);
		}
	
		Iterator<Integer> itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterator " + itr.next());
		}
		linkedList.clear(); // Removes all of the elements from this list.
		System.out.println("Cleared " + linkedList.size()); // 0
		
		
		/* Stack
		   Last in first out - LIFO or First in last out - FILO
		   Stores heterogeneous elements - [10, null, "Java"]
		   Duplicates allowed
		*/
		System.out.println("------------- Stack ---------------");
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.size()); // 0
		stack.push(10);
		stack.push(30);
		stack.push(20);
		System.out.println(stack.size()); // 3
		System.out.println(stack); // [10, 30, 20]
		Collections.sort(stack); // sorts
		System.out.println(stack); // [10, 20, 30]
		System.out.println(stack.peek()); // 30 - Returns top element 
		stack.pop(); // Removes top element
		System.out.println(stack.peek()); // 20
		System.out.println(stack.isEmpty()); // false
		System.out.println(stack.search(20)); // 1 - Returns the position of the element from the top of the stack. Else, it returns -1.
		
		while(!stack.isEmpty()) {
			System.out.println("Stack Element " + stack.peek());
			stack.pop();
		}
		
	}
}