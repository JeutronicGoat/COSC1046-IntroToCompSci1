import java.util.*;

public class Addition {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		String num1 = input.next();
		
		System.out.print("Please enter a second number: ");
		String num2 = input.next();
		
		String answer = "";
		
		int carryOverNum = 0; //for when addition exceeds 9
		
		//This loop with add the number until one numbers decimal place exceeds the other.
		int i = num1.length() - 1;
		int j = num2.length() - 1;		
		while (i >= 0 && j >= 0) { 
			
			int temp1 = Integer.parseInt(num1.substring(i, i + 1));
			int temp2 = Integer.parseInt(num2.substring(j, j + 1));
			
			if(temp1 + temp2 + carryOverNum > 9) {
				answer = ((temp1 + temp2 + carryOverNum) % 10) + answer;
				
				carryOverNum = 1;
			}
			else {
				answer = (temp1 + temp2 + carryOverNum) + answer;
				
				carryOverNum = 0;
			}
			
			i--; j--;
		}
		
		//This will finish the rest of the remaining number.
		if(i >= 0) {
			for (int count = i; count >=0; count--) {
				
				int temp1 = Integer.parseInt(num1.substring(count, count + 1));
				
				if(temp1  + carryOverNum > 9) {
					answer = ((temp1  + carryOverNum) % 10) + answer;
					
					carryOverNum = 1;
				}
				else {
					answer = (temp1  + carryOverNum) + answer;
					
					carryOverNum = 0;
				}
			}
		}
		else if(j >= 0) {
			for (int count = j; count >=0; count--) {
				
				int temp2 = Integer.parseInt(num2.substring(count, count + 1));
				
				if( temp2 + carryOverNum > 9) {
					answer = (( temp2 + carryOverNum) % 10) + answer;
					
					carryOverNum = 1;
				}
				else {
					answer = ( temp2 + carryOverNum) + answer;
					
					carryOverNum = 0;
				}
			}
		}
		if(carryOverNum == 1) {
			answer = carryOverNum + answer;
		}
		
		
		//print full answer
		System.out.printf("Addition:          %30s",num1);
		System.out.printf("\n             +     %30s\n            ",num2);
		for(int count = 37; count >= 0; count--) {
			System.out.print("-");
		}
		System.out.printf("\n             =     %30s",answer);
		
	}
}
