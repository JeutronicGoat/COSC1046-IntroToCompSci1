import java.util.*;

public class Loops {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//User input
		System.out.print("Enter two integer numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//Swap Test
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//First loop
		int i = num1;
		while(i <= num2) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		//Second loop
		int sum = 0;
		i = num1;
		do {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		} while (i <= num2);
		System.out.println("\nThe sum of the odd number is " + sum + ".");
		
		//Third loop
		for (i = 1; i <= 200; i += 4) {
			System.out.printf("%3d %5d %7d \n", i, i * i, i * i * i);
		}
		
		//Fourth loop
		for (sum = 0, i = num1; i <= num2; i++) {
			if (i % 2 ==0) {
				sum += i * i;
			}
		}
		System.out.println("The sum of the squares of the even numbers is " + sum + ".");
		
		//Fifth loop
		for (char letter = 'A'; letter <= 'Z'; letter += 2) {
				System.out.print(letter + " ");
		}
		
	}
}
