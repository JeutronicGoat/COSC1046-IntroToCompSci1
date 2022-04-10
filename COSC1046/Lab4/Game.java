import java.util.*;
public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int low = 1 + (int)(Math.random() * (50 - 1 + 1));
		int high = 75 + (int)(Math.random() * (125 - 75 + 1));
		int randomNum = low + ((int)(Math.random() * (high - low + 1)));
		
		int count = 0;
		
		boolean loop = true;
		while(loop) {
			System.out.print("Enter a number between " + low + " and " + high +": ");
			int userAnswer = input.nextInt();
			count++;
						
			if (userAnswer == randomNum) {
				loop = false;
			}
			else if(userAnswer < randomNum) {
				System.out.print("Your guess is too low. ");
			}
			else if(userAnswer > randomNum) {
				System.out.print("Your guess is too high. ");
			}
			
		}
		
		System.out.print("It took you " + count + " tries to guess correctly. Thank you for playing!!!");
	}
}
