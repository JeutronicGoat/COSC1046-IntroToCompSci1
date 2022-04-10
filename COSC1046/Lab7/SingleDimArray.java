import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] randArray1 = new int[20];
		int[] randArray2 = new int[20];
		int[] addArray = new int[20];
		int[] subArray = new int[20];
		
		System.out.print("Please anter and low and high value: ");
		int low = input.nextInt();
		int high = input.nextInt();
		
		//swap
		if(high < low) {
			int temp = low;
			low = high;
			high = temp;
		}
		
		randomizeArray(randArray1, low, high);
		randomizeArray(randArray2, low, high);
		
		
		for(int i = 0; i < randArray1.length; i++) {
			//addArray
			addArray[i] = randArray1[i] + randArray2[i];
			//subArray
			subArray[i] = randArray1[i] - randArray2[i];
		}
		
		System.out.println("The sum of randArray1 is: " + sumArray(randArray1));
		System.out.println("The sum of randArray2 is: " + sumArray(randArray2));
		System.out.println("The sum of addArray is: " + sumArray(addArray));
		System.out.println("The sum of subArray is: " + sumArray(subArray));
		
		System.out.print("randArray1: "); printArray(randArray1);
		System.out.print("randArray2: ");printArray(randArray2);
		System.out.print("addArray: ");printArray(addArray);
		System.out.print("subArray: ");printArray(subArray);
		
	}
	
	public static void randomizeArray(int[] array, int low, int high) {
		
		for(int i = 0; i < array.length; i++) {
			array[i] = randomNum(low, high);
		}
	}
	 
	public static int sumArray(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
	public static void printArray(int[] array) {
		
		System.out.print("{");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +(i == array.length - 1  ? "" : ", "));
			/*
			if(i == array.length - 1) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(array[i] + ", ");
			}
			*/
			
		}
		System.out.println("}");
	}
	
	public static int randomNum(int low, int high) {
		
		int randomNum = low + ((int)(Math.random() * (high - low + 1)));
		
		return randomNum;
	}
}
