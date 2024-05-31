// Parameterized constructor
package Exp4;
class Addition{
	Addition(int a,int b){
		System.out.println("This is parameterized constructor");
	
		System.out.println("result of addition :"+(a+b));
	}
}
public class Parameterized_Constructor {

	public static void main(String[] args) {
		Addition addobj=new Addition(10,20);
}

}
