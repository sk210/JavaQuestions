
// Java program to count Number of digits in an integer

package java_package;

public class NumberOfDigits {

	public static void main(String[] args) {

		long num = 989098878;
		int count = 0;
		
		while(num != 0)
		{
			num = num/10;
			++count;
		}
		System.out.println(count);
	}

}
