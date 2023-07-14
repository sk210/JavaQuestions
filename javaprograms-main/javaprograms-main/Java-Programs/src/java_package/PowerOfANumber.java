
// Java program to calculate power of a number

package java_package;

public class PowerOfANumber {
	
	public static void main(String[] args) {
		
		int base = 3;
		int exponent = 4;
		
		long result = 1;
		
		while(exponent != 0)
		{
		//	result *= base;  
			result = result * base;
			--exponent;
		}
		System.out.println(result);
		
		// using Math class
		
		System.out.println(Math.pow(base, exponent));
	}

}
