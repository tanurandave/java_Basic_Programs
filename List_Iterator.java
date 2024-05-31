package exp11;

import java.util.*;

public class List_Iterator {
	public static void main(String ar[]) {
		LinkedList<Integer> a = new LinkedList<>();
		System.out.println("size of linked_list:" + a.size());
		a.add(10);
		a.add(1,20);
		a.addLast(30);
		a.addFirst(40);
		System.out.println("linked_list elements:");
		for (int i = 0; i < a.size(); i++) {
			System.out.print("\t" + a.get(i));
		}
		System.out.println("\nsize of linked_list:" + a.size());
		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		a.remove(0);
		System.out.print("after removing 40 linked_List:" + a);
	}
}