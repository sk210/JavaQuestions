
// Java Program to find largest among three numbers 

package java_package;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int a = 4000;
		int b = 3000;
		int c = 4000;
		
		// Method 1
		if (a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if(b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number"); 
		}
		
		// method 2
		
		if (a>=b)
		{
			if(a>=c)
			{
				System.out.println("a is largest number");
			}
			else
			{
				System.out.println("c is largest number"); 
			}
		}
		else
		{
			if(b>=c)
			{
				System.out.println("b is largest number");
			}
			else
			{
				System.out.println("c is largest number");
			}
		}
			
	}

}
