import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the # of rows and columns in the array: ");
		int row = in.nextInt();
		int column = in.nextInt();
		
		double[][] a = new double[row][column];
		
		System.out.println("Enter the array: ");
		
		for(int i =  0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				a[j][i] = in.nextDouble();
			}
		}
		
		Location location = locateLargest(a);
		
		System.out.print("The location of the largest element is " + a[location.row][location.column]
		+ " at " + location.toString() + ".");
		
		
	}
	
	public static Location locateLargest(double[][] a) {
		
		int row = 0;
		int column = 0;
		
		double max = a[0][0];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] > max) {
					row = i;
					column = j;
					max = a[i][j];
				}
			}
		}
		Location location = new Location(row, column);
		return location;
	}
	
}
