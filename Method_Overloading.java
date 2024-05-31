package Exp5;
class Addition_Overloading{
	
	public void add(int a,int b) {
		System.out.println("Addition of two numbers:"+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Addition of three numbers:"+(a+b+c));
	}

}
public class Method_Overloading {

	public static void main(String[] args) {
		Addition_Overloading a=new Addition_Overloading();
		a.add(20, 30);
		a.add(10, 30, 80);
	}

}
