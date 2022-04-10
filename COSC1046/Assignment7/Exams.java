import java.util.*;

public class Exams {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("What average do you want from the course? ");
			int d = in.nextInt();
		
			if(d < 0) {
				System.out.println("Goodbye.");
				System.exit(0);
			}
			
			System.out.print("How many tests, including the final, are there? ");
			int k = in.nextInt();
		
			System.out.print("Please provide the test weights: ");
			int[] testWeights = new int[k];
			for(int i = 0; i < testWeights.length; i++) {
				testWeights[i] = in.nextInt();
			}
		
			System.out.print("Please provide the test grades out of 100: ");
			int[] testGrades = new int[k - 1];
			for(int i = 0; i < testGrades.length; i++) {
				testGrades[i] = in.nextInt();
			}
		
			//your grade with no final in other words your grade assuming final grade is 0
			double gradeNoFinal = 0;
		
			for(int i = 0; i < testGrades.length; i++) {
				gradeNoFinal += ((testWeights[i] / 100.0) * testGrades[i]);
			}
		
			if(gradeNoFinal >= d) {
				System.out.print("You will achieve an average of " + d + " no matter what your final exam grade is.");
				continue;
			}
			
			//testing the grade needed to pass with desired mark
			boolean test = false;
			int gradeNeeded;
			for(gradeNeeded = 1; gradeNeeded <= 100; gradeNeeded++) {
				
				if(((testWeights[testWeights.length - 1] / 100.0) * gradeNeeded) + gradeNoFinal >= d) {
					test = true;
					break;
				}
			}
			
			if(test) {
				System.out.println("You can achieve an average of " + d + " with a final exam grade of " + gradeNeeded + ".");
			}
			else {
				System.out.println("It is impossible to achieve an average of " + d + ".");
			}
		
			System.out.println();
		}
	}//main
}//class
