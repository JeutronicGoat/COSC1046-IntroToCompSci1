import java.util.*;
public class GrossPayCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many hours worked this week: ");
		int hoursWorked = input.nextInt();
		if(hoursWorked < 0) {
			System.out.println("Invalid Number or Hours.");
			System.exit(1);
		}
		
		System.out.print("Enter employee classification: ");
		int classification = input.nextInt();
		
		switch(classification) {
		case 1: System.out.printf("The employee (Floor Clerk) has a gross pay of: $%.2f", (11.00 * hoursWorked));
			break;
		case 2: System.out.printf("The employee (Cashier) has a gross pay of: $%.2f", (11.50 * hoursWorked));
			break;
		case 3: System.out.printf("The employee (Head Cashier) has a gross pay of: $%.2f", (12.50 * hoursWorked));
			break;
		case 4: System.out.printf("The employee (Department Manager) has a gross pay of: $%.2f", (14.00 * hoursWorked));
			break;
		case 5: System.out.printf("The employee (Store Manager) has a gross pay of: $%.2f", (18.00 * hoursWorked));
			break;
		default: System.out.print("Invalid classification number.");
			break;
		}
	}
}