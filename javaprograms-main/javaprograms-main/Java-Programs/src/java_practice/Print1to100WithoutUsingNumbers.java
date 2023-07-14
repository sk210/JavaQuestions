package java_practice;

public class Print1to100WithoutUsingNumbers {
	
	public static void main(String[] args)
	{
		printnum2();
	}
	
	// Solution 1
	public static void printnum1()
	{
		int num = 'A'/'A';
		String temp= "..........";
		for(int i=num; i<= temp.length()*temp.length(); i++)
		{
			System.out.println(i);
		}
	}
	
	// Solution 2
	public static void printnum2()
	{
		int num = 'A'/'A';
		for(int i=num; i<= 'd' ; i++)
		{
			System.out.println(i);
		}
	}

}
