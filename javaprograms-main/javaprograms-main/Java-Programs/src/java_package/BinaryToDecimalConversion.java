
// Java program for Binary to Decimal conversion

package java_package;

public class BinaryToDecimalConversion {
	
	public static void main(String[] args) {
		
		long num = 10011011;
		int decimal = convertBinarytoDecimal(num);
		System.out.println(decimal);
	}
	
	public static int convertBinarytoDecimal(long num)
	{
		int decimalNumber = 0;
		int i =0;
		long remainder;
		while(num!=0)
		{
			remainder = num % 10;
			num = num/10;
			decimalNumber += remainder * Math.pow(2, i);
			++i;
		}
		return decimalNumber;
	}

}
