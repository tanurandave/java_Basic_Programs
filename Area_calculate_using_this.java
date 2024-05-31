package Exp5;

class Circle_Area{
	int radius;
		Circle_Area(int radius)
		{
				this.radius=radius;
				System.out.println("Area of Circle="+(3.14*radius*radius));
		}
}
class reactangle_Area{
	int l,b;
	reactangle_Area(int l,int b)
		{
			this.l=l;
			this.b=b;
			System.out.println("Area of Rectangle="+(l*b));
		}
}
class Square_Area
{
		int side;
		Square_Area(int side)
		{
		this.side=side;
		System.out.println("Area of Square="+(side*side));
		}
}
class Triangle_Area{
	int length,base;
	Triangle_Area(int length ,int base)
	{
		this.length=length;
		this.base=base;
		System.out.println("area of triangle="+((length*base)/2));
	}
}
public class Area_calculate_using_this {

	public static void main(String[] args) 
	{
			new Circle_Area(4);
			new reactangle_Area(3,5);
			new Square_Area(6);
			new Triangle_Area(2,4);
			
	}
}


