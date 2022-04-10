import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the size of the matrix (n x n): ");
		int n = input.nextInt();
		
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n ; j++) {
				System.out.printf("%4d", randomInt(-99, 99));
			}
			
			System.out.println();
		}
		
	}
	
	public static int randomInt(int low, int  high) {
		
		int num = low + (int)(Math.random() * (high - low + 1));
		
		return num;
	}
}
