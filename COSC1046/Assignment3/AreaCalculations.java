import java.util.Scanner;

public class AreaCalculations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int number = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double area = ((number * Math.pow(side, 2.0)) / (4.0 * Math.tan(Math.PI / number)));
		
		System.out.print("The area of the polygon is: " + area);
	}
}