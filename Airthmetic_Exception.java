package Exp8;

public class Airthmetic_Exception {

	public static void main(String[] args) {
		try
		{ 
			int num1=2;
			int num2=0;
			float result=num1/num2;
			System.out.println("Division:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{ 
			System.out.println("Execution is completed"); }
		}
	}

