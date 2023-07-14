
// Java program to check whether a number can be expresses as sum of two prime numbers
// 34 = 3+31 5+29 11+23 17+17

package java_package;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		int num = 34;
		boolean flag = false;
		
		for(int i =2; i <= num / 2; i++)
		{
			if(checkPrimeNumber(i))
			{
				if(checkPrimeNumber(num - i))
				{
					System.out.println(num + " = " + i +" + "+ (num -i));
					flag = true;
				}
			}
		}
	}
	
	public static boolean checkPrimeNumber(int num)
	{
		boolean isPrime = true;
		for (int i = 2; i<= num/2; i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
