
// Java program to compute quotient and reminder

package java_package;

public class QuotientAndReminder {

	public static void main(String[] args) {

		int dividend = 43;
		int divisor = 6;
		
		int quotient = dividend/divisor;
		int reminder = dividend % divisor;
		
		System.out.println("Quotient is : "+ quotient);
		System.out.println("Remainder is : "+ reminder);
	}

}
