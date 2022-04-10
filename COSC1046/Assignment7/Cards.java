import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[][] cards = new int[4][13];
		
		for(int i = 0; i < cards.length; i++) {
			for(int j = 0; j < cards[i].length; j++) {
				cards[i][j] = j + 1;
			}
		}
		
		
		System.out.print("Enter the amount of cards would you like to select: ");
		int selectNum = in.nextInt();
		
		System.out.println("Your cards are: ");
		for(int i = 0; i < selectNum; i++) {
			printCard(chooseRandomCard());
		}
		
	}
	
	public static void printCard(int[] card) {
		
		System.out.print("The ");
		if(card[1] == 1) {
			System.out.print("Ace ");
		}
		else if(card[1] == 11) {
			System.out.print("Jack ");
		}
		else if(card[1] == 12) {
			System.out.print("Queen ");
		}
		else if(card[1] == 13) {
			System.out.print("King ");
		}
		else {
			System.out.print(card[1] + " ");
		}
		
		System.out.print("of ");
		if (card[0] == 1) {
			System.out.println("Spades.");
		}
		else if (card[0] == 2) {
			System.out.println("Clubs.");
		}
		else if (card[0] == 3) {
			System.out.println("Diamonds.");
		}
		else {
			System.out.println("Hearts.");
		}
	}
	
	public static int[] chooseRandomCard() {
		int[] randomCard = new int[2];
		
		randomCard[0] = randomInt(1 , 4); //suit
		randomCard[1] = randomInt(1 , 13); //card
		
		return randomCard;
	}
	
	public static int randomInt(int low, int high) {
		return (int)(Math.random() * (high - low + 1)) + low;
	}
}
