package Exp9;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	UnderAgeException()
	{ 
	System.out.println("You must be at least 18 years old for voating");
	}
}
public class User_Defined_Exception {
static void checkAge(int age)
{ if (age >= 18)
{ System.out.println("You are eligible for voating");
}
try{
if (age < 18) {
throw new UnderAgeException(); }
}
catch(Exception e)
{
}
}
public static void main(String[] args) {
	System.out.println("Enter age:");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
checkAge(age);
}
}