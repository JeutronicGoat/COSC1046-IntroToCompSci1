import java.util.*;

public class Pentagon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double side = 0.0;
		do {
			
			System.out.print("Enter the side: ");
			side = input.nextDouble();
			
			if(side >= 0) {
				System.out.printf("The area of the pentagon is %7.4f.\n\n", pentagonArea(side));
			}
		} while(side >= 0);
	}
	
	public static double pentagonArea(double s) {
		
		return ((5.0 * Math.pow(s, 2)) / (4.0 * Math.tan(Math.PI / 5)));
		
	}
}
