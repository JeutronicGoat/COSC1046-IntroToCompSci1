import java.util.*;

public class LargerNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		int max = 0;
		int count = 0;
		for(int i = input.nextInt(); i != 0; i = input.nextInt()) {
			if(i > max) {
				max = i;
				count = 1;
			}
			else if(i == max) {
				count++;
			}
		}
		
		System.out.println("The largest number is " + max + ".");
		System.out.print("The occurence count of the largest number is " + count + ".");
	}
}
