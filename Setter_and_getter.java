package Exp4;
class Student{
	int srollno;
	String sname,sdept,sdiv;
	
	void getdata(int n,String name,String dept,String div){
		sname=name;
		srollno=n;
		sdept=dept;
		sdiv=div;
		
	}
	void setdata(){
		System.out.println("Roll_no:"+srollno+"\nStudent name:"+sname+"\nStudent department:"+sdept+"\nStudent division:"+sdiv);
	}
}
public class Setter_and_getter {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.getdata( 1,"Anuja", "CSE", "B");
		s.setdata();
	}

}
