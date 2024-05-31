package Exp6;
class Rectangle {
public void rectangle_area(){
System.out.println(" area of rectangle::"+(2*3));
}
}
class Circle extends Rectangle{
public void circle_area(){
System.out.println(" area of circle::"+(3.14*2*3));
}
}
class Square extends Circle {
public void square_area(){
System.out.println(" area of Square::"+(2*2));
}
}
public class Hybrid_Inheritance {

	public static void main(String[] args) {

		Square s=new Square();
		s.square_area();
		s.circle_area();
		s.rectangle_area();
	}

}
