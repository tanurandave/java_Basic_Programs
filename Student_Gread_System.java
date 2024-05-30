package Exp2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student_Gread_System {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks :");
		try {
			 double marks=sc.nextDouble();

			if(marks<35) {
				System.out.println("Fail");
			}
			else if(marks>=35&&marks<=50) {
				System.out.println("marks is: "+marks+" Gread :C");
			}
			else if(marks>50&&marks<=70){

				System.out.println("marks is: "+marks+" Gread :B");
			}
			else if(marks>70&&marks<=80){

				System.out.println("marks is: "+marks+" Gread :A");
			}
			else if(marks>=90){

				System.out.println("marks is: "+marks+" Gread :A");
			}
			else {
				
				System.out.println("Invalid marks");
			
			}

			
		}catch(InputMismatchException e) 
		{
			System.out.println("plz enter valid marks");
			}
	
}}
