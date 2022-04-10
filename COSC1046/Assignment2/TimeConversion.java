import java.util.Scanner;
public class TimeConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an amount of time in seconds: ");
		long initialSeconds = input.nextLong();
		long seconds = initialSeconds;
		
		int minutes = (int)(seconds / 60);
		seconds %= 60;
		
		int hours = minutes / 60;
		minutes %= 60;
		
		int days = hours / 24;
		hours %= 24;
		
		int years = days / 365;
		days %= 365;
		
		System.out.print(initialSeconds + " seconds is approximatley " + years + " years, "
			+ days + " days, " + hours + " hours, " + minutes + " minutes and "
			+ seconds + " seconds.");
	}
}
