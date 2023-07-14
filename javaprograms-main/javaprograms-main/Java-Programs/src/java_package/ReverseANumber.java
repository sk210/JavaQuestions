
// Java Program to Reverse a number

package java_package;

public class ReverseANumber {

	public static void main(String[] args) {

		int num = 123;
		int rev= 0;
		
		while(num != 0)
		{
			int n = num % 10; // 3 2 1
			rev= rev * 10 + n;  // 3 32 321
			num = num / 10;  // 12 1 0
		}
		System.out.println(rev);
	}

}
