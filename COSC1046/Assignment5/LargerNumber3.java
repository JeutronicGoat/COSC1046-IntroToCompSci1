import java.util.Scanner;

public class LargerNumber3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		int max = 0;
		int count = 0;
		
		int i = input.nextInt();
		do {
			if(i > max) {
				max = i;
				count = 1;
			}
			else if(i == max) {
				count++;
			}
			i = input.nextInt();
		} while(i != 0);
		
		System.out.println("The largest number is " + max + ".");
		System.out.print("The occurence count of the largest number is " + count + ".");
	}
}