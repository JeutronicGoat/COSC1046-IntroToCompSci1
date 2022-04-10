import java.util.*;

public class TwinPrimes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a range (Low High): ");
		int low = input.nextInt();
		int high = input.nextInt();
		
		if (low > high) {
			int temp = low;
			low = high;
			high = temp;
		}
		
		primeList(low, high);
	}
	
	public static void primeList(int low, int high) {
		
		for(int i = low; i <= high; i++) {
			
			if(primeCheck(i) && primeCheck(i + 2)) {
				System.out.println("(" + i + ", " + (i + 2) + ")");
			}
		}
	}
	
	public static boolean primeCheck(int num) {
		
		for(int i = 2; i <= num / 2; i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
