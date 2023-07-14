
// Java Program to check leap year

package java_package;

public class LeapYear {

	public static void main(String[] args) {

		// Conditions
		// divisible by 4 all the century years --- ending with 00
		// century year is leap year only when it is perfectly divisible by 400
		
		int year = 1900;
		boolean leap =false;
		
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					leap = true;
				}
				else{
					leap = false;
				}
			}else{
				leap = true;
			}
		}
		else{
			leap = false;
		}
		
		if (leap){
			System.out.println(year+ " is a leap year");
		}
		else {
			System.out.println(year+ " is not a leap year");
		}
	}
	

}
