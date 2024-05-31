package Exp6;
class Parent{
	Parent(){
		System.out.println("This is parent class");
	}
}
class Intermediate extends Parent{
	Intermediate(){
		System.out.println("This is Intermediate class");
	}
}
class Child extends Intermediate{
	Child(){
		System.out.println("This is child class");
	}
}
public class Multilevle_Inheritance {

	public static void main(String[] args) {
	new Child();	
	}

}
