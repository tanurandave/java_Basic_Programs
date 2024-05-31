package Exp10;

public class String_Builder_Buffer {

	public static void main(String[] args) {
		
		String s="hiii";
		StringBuilder s1=new StringBuilder("hii");
		StringBuffer s2=new StringBuffer("hii");
		
		s.concat("Hello");
		s1.append(" guys");
		s2.append(" guys");
		
		System.out.println("String Demo: "+s);
		System.out.println("StringBuilder Demo: "+s1);
		System.out.println("StringBuffer Demo:"+s2);

	}

}