package Exp5;
class Static_Keyword
{
	static String name="Randave";
	static void add()
	{
		int a=10,b=20;
		System.out.println("addition is:"+(a+b));
	}

	public static void main(String[] args)
	{
		
		add();
		System.out.println("name:"+name);
	}
}
