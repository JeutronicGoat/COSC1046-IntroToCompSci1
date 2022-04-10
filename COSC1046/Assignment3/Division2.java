import java.util.*;
public class Division2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if(num % 17 == 0 && num % 3 == 0) {
			System.out.println(num + " is divisible by both 17 and 3.");
		}
		else if(num % 17 == 0 ^ num % 3 == 0) {
			System.out.println(num + " is divisible by 17 or 3, but not both.");
		}
		else {
			System.out.println(num + " is divisible by neither 17 nor 3.");
		}
		
	}
}
