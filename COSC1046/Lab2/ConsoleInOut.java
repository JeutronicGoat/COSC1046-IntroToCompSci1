import java.util.Scanner;

public class ConsoleInOut {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
	System.out.print("Please enter your name: ");
	String name = input.nextLine();
	
	System.out.print("Please enter your favourite integer number: ");
	int integerNumber = input.nextInt();
	
	System.out.print("Please enter your favourite colour: ");
	String colour = input.next();
	
	System.out.print("Please enter the answer to the expression {17 + 3 x 4.6}: ");
	double answer = input.nextDouble();
	
	System.out.print("\nYour name is " + name + ", your favourite integer number is " + integerNumber + 
			", and your favourite colour is " + colour + "\nYour answer to the expression is " + answer + 
			". The correct answer is 30.8.");
	}
}
