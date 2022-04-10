import java.util.*;

public class Letters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Enter the first string: ");
			String firstString = in.next();
			firstString = firstString.toLowerCase();//to lowercase
			
			//end test
			if(firstString.equals("end")) {
				System.out.print("Goodbye.");
				System.exit(0);
			}
			
			System.out.print("Enter the second string: ");
			String secondString = in.next();
			secondString = secondString.toLowerCase();//to lowercase
			
			//Quick check
			if(firstString.length() != secondString.length()) {
				System.out.println("They are different.");
				System.out.println();
				continue;
			}
		
			//Detailed Check
			if(matchCheck(countLetters(firstString, secondString))) {
				System.out.println("They are the same.");
			}
			else {
				System.out.println("They are different.");
			}
			
			System.out.println();
		}
	}
	
	public static boolean matchCheck(int[][] letters) {
		
		for(int i = 0; i < letters[0].length; i++) {
			if(letters[0][i] != letters[1][i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[][] countLetters(String s1, String s2) {
		
		int[][] letterCount = new int[2][26];
		
		//Counting how many of each letter in each string
		for(int j = 0; j < s1.length(); j++) {
			letterCount[0][testLetter(s1.charAt(j))] += 1;
			letterCount[1][testLetter(s2.charAt(j))] += 1;
		}
		
		return letterCount;

	}
	
	public static int testLetter(char letter) {
		
		switch(letter) {
			case 'a': return 0;
			case 'b': return 1;
			case 'c': return 2;
			case 'd': return 3;
			case 'e': return 4;
			case 'f': return 5;
			case 'g': return 6;
			case 'h': return 7;
			case 'i': return 8;
			case 'j': return 9;
			case 'k': return 10;
			case 'l': return 11;
			case 'm': return 12;
			case 'n': return 13;
			case 'o': return 14;
			case 'p': return 15;
			case 'q': return 16;
			case 'r': return 17;
			case 's': return 18;
			case 't': return 19;
			case 'u': return 20;
			case 'v': return 21;
			case 'w': return 22;
			case 'x': return 23;
			case 'y': return 24;
			default: return 25;
		}
	}
}
