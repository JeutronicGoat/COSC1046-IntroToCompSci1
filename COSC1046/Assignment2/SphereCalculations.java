import java.util.Scanner;
public class SphereCalculations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a radius of the sphere: ");
		double radius = input.nextDouble();
		
		double surfaceArea = 4.0 * Math.PI * Math.pow(radius , 2);
		double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("The surface area of the sphere is " + surfaceArea);
		System.out.print("The volume of the sphere is " + volume);
	}
}
