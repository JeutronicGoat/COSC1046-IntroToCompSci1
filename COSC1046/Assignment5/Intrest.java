import java.util.*;

public class Intrest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Please enter an anual percentage yeild: ");
		double anualYeild = input.nextDouble();
		
		System.out.print("Please enter the number of months: ");
		int months = input.nextInt();

		for(int i = 1; i <= months; i++) {
			amount = amount + amount * anualYeild / 1200.0;
		}
		
		System.out.printf("The CD would be worth $%.2f", amount);
	}
}
