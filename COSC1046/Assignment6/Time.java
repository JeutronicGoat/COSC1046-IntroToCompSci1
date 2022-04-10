
public class Time {

	public static void main(String[] args) {
		
		currentTime();
		
	}
	
	public static void currentTime() {
		
		long millisecondsTime = System.currentTimeMillis();
		long secondsTime = 0L;
		long minutesTime = 0L;
		long hoursTime = 0L;
		long daysTime = 0L;
		String month = "";
		long yearsTime = 1970L;
		
		//seconds
		secondsTime = millisecondsTime / 1000;
		millisecondsTime %= 1000;
		
		//minutes
		minutesTime = secondsTime / 60;
		secondsTime %= 60;
		
		//hours
		hoursTime = minutesTime / 60;
		minutesTime %= 60;
		
		//days
		daysTime = hoursTime / 24;
		hoursTime %= 24;
		hoursTime += 19;
		
		//years
		int leapYearCount;
		for(leapYearCount = 2; daysTime - 366 >= 0; leapYearCount++) {
			//leap year
			if(leapYearCount == 4) {
				leapYearCount = 0;
				
				daysTime -= 366;
				yearsTime++;
			}
			else {
				
				daysTime -= 365;
				yearsTime++;
			}
		}
		if(daysTime - 365 >= 0) {
			
			daysTime -= 365;
			yearsTime++;
		}
		
		//months
		//Jan
		if(daysTime <= 31) {
			month = "Jan";
		}
		//Feb
		else if(leapYearCount == 4) {   //daysTime - 59 <= 28 || daysTime - 60 <= 29
			if(daysTime <= 60) {
				daysTime -= 31;
				month = "Feb";
			}
			//March
			else if(daysTime <= 91) {
				daysTime -= 60;
				month = "March";
			}
			//April
			else if(daysTime <= 121) {
				daysTime -= 91;
				month = "April";
			}
			//May
			else if(daysTime <= 152) {
				daysTime -= 121;
				month = "May";
			}
			//June
			else if(daysTime <= 182) {
				daysTime -= 152;
				month = "June";
			}
			//July
			else if(daysTime <= 213) {
				daysTime -= 182;
				month = "July";
			}
			//August
			else if(daysTime <= 244) {
				daysTime -= 213;
				month = "August";
			}
			//Sept
			else if(daysTime <= 274) {
				daysTime -= 244;
				month = "Sept";
			}
			//Oct
			else if(daysTime <= 305) {
				daysTime -= 274;
				month = "Oct";
			}
			//Nov
			else if(daysTime <= 335) {
				daysTime -= 305;
				month = "Nov";
			}
			//Dec
			else{
				daysTime -= 335;
				month = "Dec";
			}
		}
		else if(daysTime <= 59) {
			daysTime -= 31;
			month = "Feb";
		}
		//March
		else if(daysTime <= 90) {
			daysTime -= 59;
			month = "March";
		}
		//April
		else if(daysTime <= 120) {
			daysTime -= 90;
			month = "April";
		}
		//May
		else if(daysTime <= 151) {
			daysTime -= 120;
			month = "May";
		}
		//June
		else if(daysTime <= 181) {
			daysTime -= 151;
			month = "June";
		}
		//July
		else if(daysTime <= 212) {
			daysTime -= 181;
			month = "July";
		}
		//August
		else if(daysTime <= 243) {
			daysTime -= 212;
			month = "August";
		}
		//Sept
		else if(daysTime <= 273) {
			daysTime -= 243;
			month = "Sept";
		}
		//Oct
		else if(daysTime <= 304) {
			daysTime -= 273;
			month = "Oct";
		}
		//Nov
		else if(daysTime <= 334) {
			daysTime -= 304;
			month = "Nov";
		}
		//Dec
		else {
			daysTime -= 334;
			month = "Dec";
		}
		
		System.out.println("The current date and time is " + month + " " + daysTime + ", " + yearsTime + " " + hoursTime + ":" + minutesTime + ":" + secondsTime + ".");
	}
	
}
