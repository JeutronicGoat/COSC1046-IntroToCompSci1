import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int compAnswer = (int) (Math.random() * 5);
		// 0=Rock 1=Paper 2=Scissors 3=Lizard 4=Spock
		
		System.out.print("Enter your weapon of choice " +
		"(Rock, Paper, Scissors, Lizards, Spock): ");
		String playerInput = input.nextLine();
		char playerAnswer = playerInput.toUpperCase().charAt(0);
		
		if (playerAnswer == 'S') {
			playerAnswer = playerInput.toUpperCase().charAt(2);
		}
		// R=Rock P=Paper I=Scissors L=Lizard O=Spock
		
		switch(compAnswer) {
			case 0: System.out.println("Computer picked 'Rock'.");
			break;
			case 1: System.out.println("Computer picked 'Paper'.");
			break;
			case 2: System.out.println("Computer picked 'Scissors'.");
			break;
			case 3: System.out.println("Computer picked 'Lizard'.");
			break;
			case 4: System.out.println("Computer picked 'Spock'.");
			break;
		}
		
		if (playerAnswer == 'R') {
			switch(compAnswer) {
				case 0: System.out.print("Draw, try again.");
				break;
				case 1: System.out.print("Paper covers rock, you lose.");
				break;
				case 2: System.out.print("Rock crushes scissors, YOU WIN!!");
				break;
				case 3: System.out.print("Rock smashes lizard, YOU WIN!!");
				break;
				case 4: System.out.print("Spock vaporizes rock, you lose.");
				break;
			}
		}
		else if (playerAnswer == 'P') {
			switch(compAnswer) {
				case 0: System.out.print("Paper covers rock, YOU WIN!!");
				break;
				case 1: System.out.print("Draw, try again.");
				break;
				case 2: System.out.print("Scissors cuts paper, you lose.");
				break;
				case 3: System.out.print("Lizard eats paper, you lose.");
				break;
				case 4: System.out.print("Paper disproves Spock, YOU WIN!!");
				break;
			}
		}	
		else if (playerAnswer == 'I') {
			switch(compAnswer) {
				case 0: System.out.print("Rock crushes scissors, you lose.");
				break;
				case 1: System.out.print("Scissors cuts paper, YOU WIN!!");
				break;
				case 2: System.out.print("Draw, try again.");
				break;
				case 3: System.out.print("Scissors decapitates lizard, YOU WIN!!");
				break;
				case 4: System.out.print("Spock smashes scissors, you lose.");
				break;
			}
		}
		else if (playerAnswer == 'L') {
			switch(compAnswer) {
				case 0: System.out.print("Spock smashes scissors, you lose.");
				break;
				case 1: System.out.print("Lizard eats paper, YOU WIN!!");
				break;
				case 2: System.out.print("Scissors decapitates lizard, you lose.");
				break;
				case 3: System.out.print("Draw, try again.");
				break;
				case 4: System.out.print("Lizard poisons spock, YOU WIN!!");
				break;
			}
		}
		else if (playerAnswer == 'O') {
			switch(compAnswer) {
				case 0: System.out.print("Spock vaporizes rock, YOU WIN!!");
				break;
				case 1: System.out.print("Paper disproves Spock, you lose.");
				break;
				case 2: System.out.print("Spock smashes scissors, YOU WIN!!");
				break;
				case 3: System.out.print("Lizard poisons spock, you lose.");
				break;
				case 4: System.out.print("Draw, try again.");
				break;
			}
		}
		else {
			System.out.print("You did not enter a valid choice.");
		}
	}
}

