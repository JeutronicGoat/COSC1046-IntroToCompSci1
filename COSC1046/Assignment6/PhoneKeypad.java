import java.util.*;

public class PhoneKeypad {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Plaese enter a phone number (*-***-******): ");
		String userInput = input.next();
		
		String answer = "";
		for(int i = userInput.length() - 1; i >= 0; i--) {
			
			if(Character.isDigit(userInput.charAt(i)) == true){
				answer = userInput.charAt(i) + answer;
			}
			else if(Character.isLetter(userInput.charAt(i)) == true) {
				answer = getNumber(userInput.toUpperCase().charAt(i)) + answer;
			}
			else {
				answer = userInput.charAt(i) + answer;
			}
		}
		
		System.out.print(answer);
		
	}
	
	public static int getNumber(char letter) {
		if(letter == 'A' || letter == 'B' || letter == 'C') {
			return 2;
		}
		else if(letter == 'D' || letter == 'E' || letter == 'F') {
			return 3;
		}
		else if(letter == 'G' || letter == 'H' || letter == 'I') {
			return 4;
		}
		else if(letter == 'J' || letter == 'K' || letter == 'L') {
			return 5;
		}
		else if(letter == 'M' || letter == 'N' || letter == 'O') {
			return 6;
		}
		else if(letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
			return 7;
		}
		else if(letter == 'T' || letter == 'U' || letter == 'V') {
			return 8;
		}
		else {
			return 9;
		}
	}
	
}
