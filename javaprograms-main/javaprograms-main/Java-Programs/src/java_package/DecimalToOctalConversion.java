
// Java program for Decimal to Octal conversion

package java_package;

public class DecimalToOctalConversion {
	
	public static void main(String[] args)
	{
		System.out.println(convertdecimalTooctal(109));
	}
	
	public static int convertdecimalTooctal(int decimal)
	{
		int octalNumber = 0, i= 1;
		while(decimal!=0)
		{
			octalNumber+= (decimal%8) * i;
			decimal/=8;
			i*=10;
		}
		return octalNumber;
	}

}
