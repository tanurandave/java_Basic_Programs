package Exp3;

public class String_Reverse {

	public static void main(String[] args) {
		/*
		  String tr="TANUJA";
		 
		String reverse="";
		System.out.println("original string:"+tr);
			for(int i=0;i<tr.length();i++) {
			reverse=tr.charAt(i)+reverse;
		}
		System.out.println("reverse string:"+reverse);
	*/
		//  StrinBuilder and reverse function using reverse string
		  String input = "Anuja Randave";
		  
	        StringBuilder input1 = new StringBuilder();
	        input1.append(input);
	        input1.reverse();
	        System.out.println(input1);
	
		
}
}