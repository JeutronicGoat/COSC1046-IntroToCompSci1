import java.util.Scanner;
public class TriangleCalculations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter 3 points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//Point 1 to 2
		double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		//point 2 to 3
		double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		//point 3 to 1
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.rint(Math.sqrt(s * (s - side1) * (s - side2) *
				(s - side3)) * 10) / 10;
		double perimeter = Math.rint((side1 + side2 + side3) * 10) / 10;
		
		System.out.println("The area of the triangle is: " + area);
		System.out.println("The perimeter of the triangle is: " + perimeter);
	}
}
