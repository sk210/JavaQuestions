
// Java program to find the sum of natural numbers using recursion

package java_package;

public class NaturalNumbersSumWithRecursion {
	
	public static void main(String[] args) {
		
		int num = 20;
		int sum = addNum(num);
		System.out.println("sum is : "+sum);
	}
	
	public static int addNum(int num)
	{
		if(num!=0)
		{
			return num + addNum(num-1);
		}
		else
		{
			return num;
		}
	}

}
