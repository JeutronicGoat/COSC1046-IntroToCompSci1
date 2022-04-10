import java.util.*;

public class SIN_Number {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a SIN (DDD-DDD-DDD): ");
		String SIN_Number = input.nextLine();
		
		// Valid input check
		if (SIN_Number.length() != 11 
			|| SIN_Number.charAt(3) != '-'
			|| SIN_Number.charAt(7) != '-') {
			
			System.out.print(SIN_Number + " is an invalid input. Format error.");
			
			System.exit(0);
		}

		
		// Validation Formula
		
		// Digit 9
		int digitNum = Integer.parseInt(SIN_Number.charAt(10) + "");
			
		int validationNum = 0;
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
			
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
		
		validationNum += digitNum;
		
		// Digit 8
		digitNum = Integer.parseInt(SIN_Number.charAt(9) + "");
		digitNum *= 2;
				
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
			
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
		
		validationNum += digitNum;
		
		// Digit 7
		digitNum = Integer.parseInt(SIN_Number.charAt(8) + "");
						
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
			
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
				
		validationNum += digitNum;
				
		// Digit 6
		digitNum = Integer.parseInt(SIN_Number.charAt(6) + "");
		digitNum *= 2;
					
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
					
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
				
		validationNum += digitNum;
				
		// Digit 5
		digitNum = Integer.parseInt(SIN_Number.charAt(5) + "");
						
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
					
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
				
		validationNum += digitNum;
				
		// Digit 4
		digitNum = Integer.parseInt(SIN_Number.charAt(4) + "");
		digitNum *= 2;
						
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
					
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
				
		validationNum += digitNum;
				
		// Digit 3
		digitNum = Integer.parseInt(SIN_Number.charAt(2) + "");
						
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
					
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
				
		validationNum += digitNum;
				
		// Digit 2
		digitNum = Integer.parseInt(SIN_Number.charAt(1) + "");
		digitNum *= 2;
						
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
					
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
		
		validationNum += digitNum;
				
		// Digit 1
		digitNum = Integer.parseInt(SIN_Number.charAt(0) + "");
						
		if (digitNum > 9) {
			String convertVariable = digitNum + "";
					
			digitNum = Integer.parseInt(convertVariable.charAt(0) + "") + Integer.parseInt(convertVariable.charAt(1) + "");
		}
				
		validationNum += digitNum;
	
		
		if (validationNum % 10 != 0) {
			System.out.print(SIN_Number + " is invalid. The number is invalid.");
			
			System.exit(0);
		}
	
		System.out.println(SIN_Number + " is valid.");
		
	}
}
