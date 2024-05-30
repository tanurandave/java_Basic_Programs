package Exp2;
import java.util.Scanner;

public class Swapping_number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Interger value of variable a :");
	int a=sc.nextInt();
	System.out.println("Enter Interger value of variable b:");
	int b=sc.nextInt();
	System.out.println("Before swapping value of a variable: "+a+" \nBefore swapping value of b variable:  "+b);
	 
	/* 1st technique for Swapping values of two variables
	int temp;
	temp=a;
	a=b;
	b=temp
	*/
	
	/* 2nd technique for swapping values of two variables
	b=a^b;
	a=a^b;
	b=a^b;
	*/
	
	// 3rd technique for swapping values of two variables
	 a = a + b;  
	 b = a - b; 
	 a = a - b; 
	System.out.println("After swapping value of a variable: "+a+"\nAfter swapping value of b variable: "+b);
	}

}
