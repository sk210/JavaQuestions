
// Java program for Decimal to Binary conversion

package java_package;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {

		long binary = convertDecimalToBinary(156);
		System.out.println(binary);

	}
	
	public static long convertDecimalToBinary(int n)
	{
		long binaryNumber = 0;
		int remainder = 1, i = 1;
		
		while(n !=0 ) {
			remainder = n % 2;
			n = n/2;
			binaryNumber += remainder * i;
			i*=10;
		}
		return binaryNumber;
	}

}
