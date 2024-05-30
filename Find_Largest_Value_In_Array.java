package Exp2;

public class Find_Largest_Value_In_Array {

	public static void main(String[] args) {
		 int numbers[]= {10,30,80,30,90,67,28,29,15};
		 int maximum_Value=Integer.MIN_VALUE;
		 for (int num:numbers){
			 maximum_Value=Math.max(num, maximum_Value);
		 }
		 System.out.println("maximum value of array :"+maximum_Value);

	}

}
