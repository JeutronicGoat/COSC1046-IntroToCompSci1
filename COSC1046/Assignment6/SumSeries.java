import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number of the series: ");
		int num = input.nextInt();
		
		sumSeries(num);
	}
	
	public static void sumSeries(int num) {
		
		System.out.println(" i           m(i)");
		System.out.println("----------------------");
		
		double answer = 0.0;
		for(int i = 1; i <= num; i++) {
			
			answer += (i * 1.0) / (i + 1);
			
			System.out.printf("%2d          %7.4f\n", i, answer);
		}
	
	}
}
