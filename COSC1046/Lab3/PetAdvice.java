import java.util.*;
public class PetAdvice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you live in a house, apartment or dormitory: ");
		char livingSpace = input.next().toUpperCase().charAt(0);
		
		System.out.print("How many hours do you spend on average in your home every day (0-24): ");
		int hoursInHome = input.nextInt();
		
		if(livingSpace == 'H') {
			if(hoursInHome >= 18) {
				System.out.print("You should get a Pot-Bellied Pig.");
			}
			else if(hoursInHome >=10 && hoursInHome <=17) {
				System.out.print("You should get a Dog.");
			}
			else {
				System.out.print("You should get a Snake.");
			}
		}
		else if(livingSpace == 'A') {
			if(hoursInHome >= 10) {
				System.out.print("You should get a Cat.");
			}
			else {
				System.out.print("You should get a Hamster.");
			}
		}
		else if(livingSpace == 'D') {
			if(hoursInHome >= 6) {
				System.out.print("You should get a Fish.");
			}
			else {
				System.out.print("You should get a Ant Farm.");
			}
		}
		else {
			System.out.print("I cannot give you any advice.");
		}
	}
}
