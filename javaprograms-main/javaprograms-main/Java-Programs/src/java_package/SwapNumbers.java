
// Java program to swapping two numbers with and Without third variable

package java_package;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		//method 1
		
		int temp = a;
		a=b;
		b=temp;
		
		//method 2
		
		a = a-b;
		b = a+b;
		a = b-a;
		
		//method 3
		b=a+b-(a=b);
		
		System.out.println("a = "+a+" and b = "+b);
	}

}
