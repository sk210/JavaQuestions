
// Java program to check Armstrong Number

package java_package;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// 371 ==> 3*3*3 + 7*7*7 + 1*1*1 ==> 27 + 343 + 1 ==> 371
		
		int num = 371;
		int actualnum = num;
		double result = 0;
		
		while (actualnum != 0)
		{
			int n = actualnum % 10;
			result = result + Math.pow(n, 3);
			actualnum = actualnum / 10;
		}
		
		if (result == num)
		{
			System.out.println(num + " is a armstrong number");
		}
		else {
			System.out.println(num + " is not a armstrong number");
		}
	}

}
