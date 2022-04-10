import java.util.Scanner;
public class InvestmentCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of the future investment: ");
		double futureValue = input.nextDouble();
		System.out.print("Enter the number of years to the future value: ");
		int numberOfYears = input.nextInt();
		System.out.print("Enter the annual interest rate (%): ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 12.0 / 100;
		double presentValue = Math.floor(futureValue /
				(Math.pow(1 + monthlyInterestRate, 12 * numberOfYears)) * 100) / 100;
		
		System.out.print("the present value of this investment is $" + presentValue);
	}
}
