package Exp8;

import java.util.*;
public class Handling_Multiple_Exception {

	public static void main(String[] args) {
		String arr[]= {" ","Shravai","Sanskruti","Anushka","Sanika","Tanuja"};
		System.out.println("Enter roll numbers(1 to 5) :");
		
		
			try {
				
				
				Scanner sv=new Scanner(System.in);
				int length=sv.nextInt();
				for(int i=1;i<=5;i++) {
	           if(arr[length]==arr[i])
	                System.out.print(arr[i]+" ");
	        
				}
			}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("\n Array Index out of Bound Exception is occure");
		}
		catch(InputMismatchException e) {
				
				System.out.println("\nplz enter Interger ");
				
			}
	}
}



