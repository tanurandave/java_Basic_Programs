package Exp6;
class Animal{  
	public void eat(){
		System.out.println("eating");
		}  
}  
class Dog extends Animal{  
	public void bark(){
		System.out.println("barking");
	}  
}  
class Cat extends Animal{  
	public void meow(){
			System.out.println("meowing");
			}  
}  
  
public class Hirarchical_Inheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat cat=new Cat();  
		cat.meow();  
		cat.eat();  
		//cat.bark();//Error  
		d.bark();
	
	}

}
