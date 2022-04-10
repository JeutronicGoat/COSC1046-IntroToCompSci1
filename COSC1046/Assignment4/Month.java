import java.util.*;

public class Month {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String monthOfYear = input.next();
		
		// Jan
		if (monthOfYear.toUpperCase().charAt(0) == 'J'
			&& monthOfYear.toUpperCase().charAt(1) == 'A'
			&& monthOfYear.toUpperCase().charAt(2) == 'N') {
			
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		// Feb
		else if (monthOfYear.toUpperCase().charAt(0) == 'F'
				&& monthOfYear.toUpperCase().charAt(1) == 'E'
				&& monthOfYear.toUpperCase().charAt(2) == 'B') {
			
			System.out.print(monthOfYear + " " + year + " has 28 days.");
		}
		// March
		else if (monthOfYear.toUpperCase().charAt(0) == 'M'
				&& monthOfYear.toUpperCase().charAt(1) == 'A'
				&& monthOfYear.toUpperCase().charAt(2) == 'R') {
					
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		// April
		else if (monthOfYear.toUpperCase().charAt(0) == 'A'
			&& monthOfYear.toUpperCase().charAt(1) == 'P'
			&& monthOfYear.toUpperCase().charAt(2) == 'R') {
			
			System.out.print(monthOfYear + " " + year + " has 30 days.");
		}
		// May
		else if (monthOfYear.toUpperCase().charAt(0) == 'M'
				&& monthOfYear.toUpperCase().charAt(1) == 'A'
				&& monthOfYear.toUpperCase().charAt(2) == 'Y') {
			
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		// June
		else if (monthOfYear.toUpperCase().charAt(0) == 'J'
				&& monthOfYear.toUpperCase().charAt(1) == 'U'
				&& monthOfYear.toUpperCase().charAt(2) == 'N') {
					
			System.out.print(monthOfYear + " " + year + " has 30 days.");
		}
		// July
		else if (monthOfYear.toUpperCase().charAt(0) == 'J'
			&& monthOfYear.toUpperCase().charAt(1) == 'U'
			&& monthOfYear.toUpperCase().charAt(2) == 'L') {
			
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		// August
		else if (monthOfYear.toUpperCase().charAt(0) == 'A'
				&& monthOfYear.toUpperCase().charAt(1) == 'U'
				&& monthOfYear.toUpperCase().charAt(2) == 'G') {
			
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		// Sept
		else if (monthOfYear.toUpperCase().charAt(0) == 'S'
				&& monthOfYear.toUpperCase().charAt(1) == 'E'
				&& monthOfYear.toUpperCase().charAt(2) == 'P') {
					
			System.out.print(monthOfYear + " " + year + " has 30 days.");
		}
		// Oct
		else if (monthOfYear.toUpperCase().charAt(0) == 'O'
			&& monthOfYear.toUpperCase().charAt(1) == 'C'
			&& monthOfYear.toUpperCase().charAt(2) == 'T') {
			
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		// Nov
		else if (monthOfYear.toUpperCase().charAt(0) == 'N'
				&& monthOfYear.toUpperCase().charAt(1) == 'O'
				&& monthOfYear.toUpperCase().charAt(2) == 'V') {
			
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		// Dec
		else if (monthOfYear.toUpperCase().charAt(0) == 'D'
				&& monthOfYear.toUpperCase().charAt(1) == 'E'
				&& monthOfYear.toUpperCase().charAt(2) == 'C') {
					
			System.out.print(monthOfYear + " " + year + " has 31 days.");
		}
		else {
			System.out.print("Invalid Month Entered!!");
		}
	}
}
