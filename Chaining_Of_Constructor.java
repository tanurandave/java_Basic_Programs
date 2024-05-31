package Exp4;
//Chaining of constructor
public class Chaining_Of_Constructor {
	int roll_no;
	String name,department;
	
	public Chaining_Of_Constructor(int roll) {
		roll_no=roll;
		System.out.println("Roll_no:"+roll_no);
	}
	
	public Chaining_Of_Constructor(int roll,String sname) {
		this(roll);
		name=sname;
		System.out.println("Student name:"+name);
	}
	
	public Chaining_Of_Constructor(int roll,String name,String dept) {
		this(roll,name);
		department=dept;
		System.out.println("Student Department:"+department);
	}
	
	public Chaining_Of_Constructor(int roll,String name,String dept,String div) {
		this(roll,name,dept);
		String sdiv=div;
		System.out.println("Student division:"+sdiv);
	}

	public static void main(String[] args) {
		new Chaining_Of_Constructor(1,"Tanuja_r","CSE","B");

	}

}
