import java.util.*;

public class ISBN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 12 digits of an ISBN-13: ");
		String userInput = input.next();
		
		if(userInput.length() != 12) {
			System.out.print(userInput + " is an invalid input.");
			System.exit(0);
		}
		
		int lastDigit = 0;
		
		for(int i = 0; i < 12; i++) {
			if(i % 2 != 0) {
				lastDigit += 3 * Integer.parseInt(userInput.substring(i, i + 1));
			}
			else {
				lastDigit += Integer.parseInt(userInput.substring(i, i + 1));
			}
		}
		
		lastDigit = 10 - lastDigit % 10;
		if(lastDigit == 10) {
			lastDigit = 0;
		}
		
		
		System.out.print("The ISBN-13 number is " + (userInput + lastDigit));
	}
}
