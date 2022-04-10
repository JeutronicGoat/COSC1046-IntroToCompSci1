import java.util.Scanner;

public class Pyramid {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number of rows: ");
		int rowNum = input.nextInt();
		
		int count = -1; //is -1 so the math can be done easily with 1 variable
		while(count < rowNum - 1) {
			
			//spacing for pyramid
			int i = 0;
			for(i = count; i <= rowNum - 1; i++) {
				System.out.print("      ");
			}
			
			//first line
			if(count == - 1) {
				
				System.out.printf("%5d ",1);
			}
			else {
				for( i = 0; i <= count; i++) {
					System.out.printf("%5.0f ", Math.pow(2, i));
					}
				for( ; i >= 0; i--) {
					System.out.printf("%5.0f ", Math.pow(2, i));
				}
			}		
			
				System.out.println();
				count++;
		}
		
	}
}
