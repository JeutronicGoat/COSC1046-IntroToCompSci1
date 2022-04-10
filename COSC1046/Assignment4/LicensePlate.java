public class LicensePlate {
	
	public static void main (String[] args) {
		
		
		// 1 = 4 letters and 3 numbers, 2 = 3 letters and 4 numbers
		int i = (int)(1 + (Math.random() * (2 - 1 + 1)));
		
		String licensePlate = "";
		
		if (i == 1) {
			
			// 4 letters
			for(int j = 0; j < 4; j++) {
				
			int letter = (int)(1 + (Math.random() * (26 - 1 + 1)));
			
				switch(letter) {
					case 1: licensePlate += 'A';
					break;
					case 2: licensePlate += 'B';
					break;
					case 3: licensePlate += 'C';
					break;
					case 4: licensePlate += 'D';
					break;
					case 5: licensePlate += 'E';
					break;
					case 6: licensePlate += 'F';
					break;
					case 7: licensePlate += 'G';
					break;
					case 8: licensePlate += 'H';
					break;
					case 9: licensePlate += 'I';
					break;
					case 10: licensePlate += 'J';
					break;
					case 11: licensePlate += 'K';
					break;
					case 12: licensePlate += 'L';
					break;
					case 13: licensePlate += 'M';
					break;
					case 14: licensePlate += 'N';
					break;
					case 15: licensePlate += 'O';
					break;
					case 16: licensePlate += 'P';
					break;
					case 17: licensePlate += 'Q';
					break;
					case 18: licensePlate += 'R';
					break;
					case 19: licensePlate += 'S';
					break;
					case 20: licensePlate += 'T';
					break;
					case 21: licensePlate += 'U';
					break;
					case 22: licensePlate += 'V';
					break;
					case 23: licensePlate += 'W';
					break;
					case 24: licensePlate += 'X';
					break;
					case 25: licensePlate += 'Y';
					break;
					case 26: licensePlate += 'Z';
					break;
				}
			}
			
			//space in the license plate #
			licensePlate += " ";
			
			// 3 numbers
			for(int j = 0; j < 3; j++) {
				
				int num = (int)(1 + (Math.random() * (9 - 1 + 1)));
				
				licensePlate += num;
			}
		}
		else {   //if(i == 2)
			
			// 3 letters
			for(int j = 0; j < 3; j++) {
							
				int letter = (int)(1 + (Math.random() * (26 - 1 + 1)));
						
				switch(letter) {
					case 1: licensePlate += 'A';
					break;
					case 2: licensePlate += 'B';
					break;
					case 3: licensePlate += 'C';
					break;
					case 4: licensePlate += 'D';
					break;
					case 5: licensePlate += 'E';
					break;
					case 6: licensePlate += 'F';
					break;
					case 7: licensePlate += 'G';
					break;
					case 8: licensePlate += 'H';
					break;
					case 9: licensePlate += 'I';
					break;
					case 10: licensePlate += 'J';
					break;
					case 11: licensePlate += 'K';
					break;
					case 12: licensePlate += 'L';
					break;
					case 13: licensePlate += 'M';
					break;
					case 14: licensePlate += 'N';
					break;
					case 15: licensePlate += 'O';
					break;
					case 16: licensePlate += 'P';
					break;
					case 17: licensePlate += 'Q';
					break;
					case 18: licensePlate += 'R';
					break;
					case 19: licensePlate += 'S';
					break;
					case 20: licensePlate += 'T';
					break;
					case 21: licensePlate += 'U';
					break;
					case 22: licensePlate += 'V';
					break;
					case 23: licensePlate += 'W';
					break;
					case 24: licensePlate += 'X';
					break;
					case 25: licensePlate += 'Y';
					break;
					case 26: licensePlate += 'Z';
					break;
				}
			}
			
			//space in the license plate #
			licensePlate += " ";
			
			// 4 numbers
			for(int j = 0; j < 4; j++) {
							
				int num = (int)(1 + (Math.random() * (9 - 1 + 1)));
							
					licensePlate += num;
			}
		}
		
		System.out.print("A randomly generated license plate: " + licensePlate);
		
		
		
	}
}
