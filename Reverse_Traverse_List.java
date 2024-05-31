package exp11;

import java.util.Iterator;
import java.util.LinkedList;

public class Reverse_Traverse_List {
		public static void main(String[] args) 
		{ 
			LinkedList<String> linkedList = new LinkedList<>(); 
			
			
			linkedList.add("sam"); 
			linkedList.add("ram"); 
			linkedList.add("dam"); 

			Iterator<String> iterator = linkedList.descendingIterator(); 

			while (iterator.hasNext()) 
			{ 
				System.out.println(iterator.next()); 
			} 
		} 
	}
