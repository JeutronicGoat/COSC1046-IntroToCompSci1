import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three side lengths: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1) {
			System.out.print("The lengths do not define a triangle.");
			System.exit(0);
		}
		
		System.out.print("The perimeter of the triangle is: " + (side1 + side2 + side3));
	}
}
