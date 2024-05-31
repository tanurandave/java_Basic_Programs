package exp11;

import java.util.*;

class Traverse_List_Iterator {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Devansh");// Adding object in arraylist
		list.add("Advet");
		list.add("Aradhya");
		list.add("Tanishka");
		System.out.println("Traversing list through List Iterator:");
		ListIterator list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			System.out.print(list1.previous() + "\t");
		}
		System.out.println("\n");
		while (list1.hasNext()) {
			String str = (String) list1.next();
			System.out.print(str + "\t");
		}
		System.out.println("\nTraversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("\nTraversing list through forEach() method:");
		list.forEach(a -> {
			System.out.print(a + "\t");
		});
		System.out.println("\nTraversing list through forEachRemaining() method:");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> {
			System.out.print(a + "\t");
		});
	}
}