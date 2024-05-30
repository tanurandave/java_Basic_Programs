package Exp3;

public class Add_Sub__array_3by3 {

	public static void main(String[] args) {
		
		int[][] first_array = {{1, 2, 3},{4, 5, 6},{7, 18, 9}};
		int[][] second_array = {{1, 2, 3},{4, 5, 6},{7, 8, 19}};
		int[][] add_result = new int[3][3];
		int[][] sub_result = new int[3][3];
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		add_result[i][j] = first_array[i][j] + second_array[i][j];
		}
		}
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		sub_result[i][j] = first_array[i][j] - second_array[i][j];
		}
		}
		System.out.println("Addition of two arrays:");
		printArray(add_result);
		System.out.println("Subtraction of two arrays:");
		printArray(sub_result);
		}
		public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
		System.out.print(array[i][j] + " ");
		}
		System.out.println();
		}
	}

}
