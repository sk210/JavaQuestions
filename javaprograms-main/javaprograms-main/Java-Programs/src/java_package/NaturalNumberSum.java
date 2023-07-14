
// Java program to find sum of natural numbers

package java_package;

public class NaturalNumberSum {

public static void main(String[] args) {

		int num= 100;
		int sum = 0;
		int sum1 = 0;
		
		// Method 1
		
		for(int i =1; i<=num; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of natural number is "+sum);
	
	// Method 2

	int k= 1;
	while(k <= num)
	{
		sum1 = sum1 + k;
		k++;
	}
	System.out.println("Sum of natural number is "+sum1);
}
}