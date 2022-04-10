import java.util.Scanner;

public class Hours {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many employees: ");
		int employeeNum = in.nextInt();
		
		String[] empNames = new String[employeeNum];
		double[][] hours = new double[employeeNum][7];
		
		for(int i = 0; i < hours.length; i++) {
			System.out.print("Employee name: ");
			in.nextLine();
			empNames[i] = in.nextLine();
			
			System.out.print("Please enter hours (Sun-Sat): ");
			for(int j = 0; j < hours[i].length; j++) {
				hours[i][j] = in.nextDouble();
			}
			System.out.println();
		}
		
		double[] empHours= calcEmployeeHours(hours);
		double[] dayHours= calcDayHours(hours);
		
		System.out.println("Employee Name           Sun     Mon     Tues    Wed    Thurs    Fri     Sat    Total");
		System.out.println("------------------------------------------------------------------------------------");
		for(int i = 0; i < empNames.length; i++) {
			System.out.printf("%-20s", empNames[i]);
			for(int j = 0; j < hours[i].length; j++) {
				System.out.printf("%8.2f", hours[i][j]);
			}
			System.out.printf("%8.2f\n", empHours[i]);
		}
		System.out.println("                    ----------------------------------------------------------------");
		System.out.print  ("                    ");
		double total = 0;
		for(int i = 0; i < dayHours.length; i++) {
			System.out.printf("%8.2f", dayHours[i]);
			total += dayHours[i];
		}
		System.out.printf("%8.2f", total);
		System.out.println();
		System.out.println("                    ================================================================");
		
	}
	
	public static double[] calcEmployeeHours(double[][] hours) {
		
		double[] totalHours = new double[hours.length];
		
		for(int i = 0; i < hours.length; i++) {
			for(int j = 0; j < hours[i].length; j++) {
				totalHours[i] += hours[i][j];
			}
		}
		return totalHours;
	}
	
	public static double[] calcDayHours(double[][] hours) {
		
		double[] totalHours = new double[hours[0].length];
		
		for(int i = 0; i < hours[0].length; i++) {
			for(int j = 0; j < hours.length; j++) {
				totalHours[i] += hours[j][i];
				
				//totalHours[totalHours.length - 1] += hours[i][j];
			}
		}
		return totalHours;
	}
}
