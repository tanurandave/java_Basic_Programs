package Exp6;

interface Shape {
	float getArea(); 
}
class Rectangle_class implements Shape
{
	 float width;
	 float height;
	 public Rectangle_class(float width, float height) 
	 {
		 this.width = width;
		 this.height = height;
	 }
	 public float getArea()
	 { 
		 return width * height;}
	}
class Circle_class implements Shape
{
	float rr;
	public Circle_class(float rr) 
	{ 
		this.rr = rr; 
	}
	public float getArea() 
	{ float pi=3.14f;
		return (float)  (pi * rr * rr);
	}
}
class Triangle implements Shape {
	float base1;
	float height1;
	public Triangle(float base, float height) 
	{
		base1 = base;
		height1 = height;
	}
	public float getArea() 
	{
		return (float) (0.5 * base1 * height1); 
	}
}
public class Multiple_Inheritance_Using_Interface {

	public static void main(String[] args) {
		Rectangle_class rectangle = new Rectangle_class(2, 2);
		Circle_class circle = new Circle_class(4);
		Triangle triangle = new Triangle(3, 4);
		
		System.out.println("Area of rectangle: " + rectangle.getArea());
		System.out.println("Area of circle: " + circle.getArea());
		System.out.println("Area of triangle: " + triangle.getArea());
	}

}
