
// Java program for Octal to Decimal conversion

package java_package;

public class OctalToDecimalConversion {

	public static void main(String[] args) {

		System.out.println(convertOctalToDecimal(65));
	}
	
	public static int convertOctalToDecimal(int octal)
	{
		int decimalNumber = 0, i =0;
		while(octal!=0)
		{
			decimalNumber+= (octal % 10) * Math.pow(8, i);
			++i;
			octal/=10;
		}
		return decimalNumber;
	}

}
