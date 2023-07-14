
 // Java Program to find Positive or Negative number

package java_package;

public class PositiveNegativeNumber {

	public static void main(String[] args) {

		double num = -55;
		
		if (num> 0.0)
		{
			System.out.println(num+" is positive number");
		}
		else if(num< 0.0)
		{
			System.out.println(num+" is negative number");
		}
		else
		{
			System.out.println(num+" is zero");
		}
	}

}
