package java_practice;

public class Print1to100WithoutUsingLoops {
	
	public static void main(String[] args)
	{
		recursiveFunction(1);
		recursiveFunction(11, 20);
	}
	
	// Solution 1
	public static void recursiveFunction(int num)
	{
		if(num <= 100)
		{
			System.out.println(num);
			num++;
			recursiveFunction(num);
		}
	}
	
	// Solution 2
	public static void recursiveFunction(int startnum, int endnum)
	{
		if(startnum <= endnum)
		{
			System.out.println(startnum);
			startnum++;
			recursiveFunction(startnum, endnum);
		}
	}
	

}
