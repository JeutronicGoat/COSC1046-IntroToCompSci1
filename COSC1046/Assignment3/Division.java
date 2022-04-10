import java.util.*;
public class Division {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		System.out.println("Is " + num + " divisible by 17 and 3? " +
		(num % 17 == 0 && num % 3 == 0));
		
		System.out.println("Is " + num + " divisible by 17 or 3? " +
		(num % 17 == 0 || num % 3 == 0));
		
		System.out.print("Is " + num + " divisible by 17 or 3, but not both? " + 
		(num % 17 == 0 ^ num % 3 == 0));
	}
}
