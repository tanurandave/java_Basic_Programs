package Exp3;

public class Count_Vowels_In_String {

	public static void main(String[] args) {
		String mr="Mauli";
		int total=0;
		for(int i=0;i<mr.length();i++) {
		if(mr.charAt(i)=='a'||mr.charAt(i)=='e'||mr.charAt(i)=='i'||mr.charAt(i)=='o'||mr.charAt(i)=='u') {
		total++;
		}
		}
		System.out.println("Your String :"+mr);
		System.out.println("Vowels count is :"+total);
		}
	}
