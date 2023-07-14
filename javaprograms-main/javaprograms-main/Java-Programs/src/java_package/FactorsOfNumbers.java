
// Java program to find factors of number

package java_package;

public class FactorsOfNumbers {

	public static void main(String[] args) {

		int num = 30;
		
		for (int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				System.out.print(i+ " ");
			}
		}
	}
}
