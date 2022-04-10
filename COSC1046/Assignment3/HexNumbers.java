import java.util.Scanner;
public class HexNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int number = input.nextInt();
		
		String value = Integer.toHexString(number);
		
		switch(number){
			case 0: System.out.print("The hex value of " + number + " is: 0");
			break;
			case 1: System.out.print("The hex value of " + number + " is: 1");
			break;
			case 2: System.out.print("The hex value of " + number + " is: 2");
			break;
			case 3: System.out.print("The hex value of " + number + " is: 3");
			break;
			case 4: System.out.print("The hex value of " + number + " is: 4");
			break;
			case 5: System.out.print("The hex value of " + number + " is: 5");
			break;
			case 6: System.out.print("The hex value of " + number + " is: 6");
			break;
			case 7: System.out.print("The hex value of " + number + " is: 7");
			break;
			case 8: System.out.print("The hex value of " + number + " is: 8");
			break;
			case 9: System.out.print("The hex value of " + number + " is: 9");
			break;
			case 10: System.out.print("The hex value of " + number + " is: A");
			break;
			case 11: System.out.print("The hex value of " + number + " is: B");
			break;
			case 12: System.out.print("The hex value of " + number + " is: C");
			break;
			case 13: System.out.print("The hex value of " + number + " is: D");
			break;
			case 14: System.out.print("The hex value of " + number + " is: E");
			break;
			case 15: System.out.print("The hex value of " + number + " is: F");
			break;
			default: System.out.print("The number provided (" + number + ") is not a valid input.");
		}
	}
}
