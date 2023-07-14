
// Java program to find Factorial number using Recursion

package java_package;

public class FactorialNumberUsingRecursion {

	public static void main(String[] args) {

		System.out.println(multiplyNum(5));
	}
	
	public static int multiplyNum(int num)
	{
		if(num>=1)
		{
			return num * multiplyNum(num-1);
		}
		else
		{
			return 1;
		}
	}

}
