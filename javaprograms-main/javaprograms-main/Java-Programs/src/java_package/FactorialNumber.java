
// Java program to find factorial of number

package java_package;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 5;
		int fact= 1;
		
		for(int i= 1; i <=num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+ " is "+ fact);
	}

}
