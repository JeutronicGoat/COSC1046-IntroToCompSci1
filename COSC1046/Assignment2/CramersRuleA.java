import java.util.Scanner;

public class CramersRuleA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter six doubles:");
		System.out.print("a = ");
		double  a = input.nextDouble();
		System.out.print("b = ");
		double  b = input.nextDouble();
		System.out.print("c = ");
		double  c = input.nextDouble();
		System.out.print("d = ");
		double  d = input.nextDouble();
		System.out.print("e = ");
		double  e = input.nextDouble();
		System.out.print("f = ");
		double  f = input.nextDouble();
		
		double x = ((e*d) - (b*f)) / ((a*d) - (b*c));
		double y = ((a*f) - (e*c)) / ((a*d) - (b*c));
		
		System.out.println("The resulting values are as follows. x = " 
		+ x + ", and y = " + y);
	}

}
