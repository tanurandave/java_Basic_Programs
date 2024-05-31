package exp11;
import java.util.*;
public class Array_List_Iterator_pgm {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		System.out.println("size of arraylist="+a.size());
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(2,20);
		System.out.println("Array_List elements::");
		for(int i=0;i<a.size();i++){ System.out.print("\t"+a.get(i)); }
		System.out.println("\n size of Array_List: "+a.size());
		a.remove(1);
		for(int i=0;i<a.size();i++){ System.out.print("\t"+a.get(i)); }
		a.remove(0);
		System.out.print("\n after removing element array="+a);
		}
		}