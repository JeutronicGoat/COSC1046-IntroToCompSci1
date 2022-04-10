import java.util.Scanner;
public class Unicode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char character = input.nextLine().charAt(0);
		int value = character;
		
		if (value >= 48 && value <= 57) {
			System.out.print("The character '" + character + "' has the unicode value of " + value + " and is a number.");
		}
		//Vowels a=1 e=5 i=9 o=15 u=21 y=25//Upper case
		else if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
			System.out.print("The character '" + character + "' has the unicode value of " + value + " and is a letter.");
			if(value - 65 + 1 == 1 
			|| value - 65 + 1 == 5 
			|| value - 65 + 1 == 9 
			|| value - 65 + 1 == 15 
			|| value - 65 + 1 == 21 
			|| value - 65 + 1 == 25 
			|| value - 97 + 1 == 1 
			|| value - 97 + 1 == 5 
			|| value - 97 + 1 == 9 
			|| value - 97 + 1 == 15 
			|| value - 97 + 1 == 21 
			|| value - 97 + 1 == 25 ) {
				System.out.print(" Also, it is a vowel.");
			}
			else {
				System.out.print(" It is not a vowel.");
			}
		}
		else {
			System.out.print("The character '" + character + "' has the unicode value of " + value + " and is a symbol.");
		}
		
	}
}
