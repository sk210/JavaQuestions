
// Java Program to check whether the number is palindrome or not

package java_package;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 121;
		int rev = 0;
		int actualNum = num;
		
		while(num !=0)
		{
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		
		if (rev == actualNum)
		{
			System.out.println(actualNum+" is a palindrome number");
		}
		else {
			System.out.println(actualNum+" is not a palindrome number");
		}
	}

}
