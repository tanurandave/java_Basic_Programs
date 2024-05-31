package Exp6;
class A{
	A(){
		System.out.println("This is parent class");
	}
}
class B extends A{
	B(){
		System.out.println("This is child class");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		 new B();
	}

}
