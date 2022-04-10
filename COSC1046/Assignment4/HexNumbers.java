import java.util.*;
public class HexNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter the decimal value
		System.out.print("Enter a decimal value (0 to 65535): ");
		int num = input.nextInt();
		
		String hexNum = "";
		
		int count = 0;
		while(count < 4) {
			
			int remainder = (num % 16);
			
			//Adding the hex letter value instead of a number value
			if (remainder > 9) {
				switch(remainder) {
					case 10: hexNum = 'A' + hexNum;
					break;
					case 11: hexNum = 'B' + hexNum;
					break;
					case 12: hexNum = 'C' + hexNum;
					break;
					case 13: hexNum = 'D' + hexNum;
					break;
					case 14: hexNum = 'E' + hexNum;
					break;
					case 15: hexNum = 'F' + hexNum;
					break;
				}
			}
			else {
				hexNum = remainder + hexNum;
			}
			
			num /= 16; //Next Hexdigit
			
			count++;
		}
		//Print the hex value
		System.out.print("The hex value is " + hexNum);
		
	}
}
