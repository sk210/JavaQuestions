package java_practice;

public class CompareTwoIntegerNumbersIntegerCaching {
	
	public static void main(String[] args)
	{
		Integer num1 = 180;
		Integer num2 = 180;
		
		// Integer caching, if we compare numbers from -128 to 127 it returns true else false
		// it is comparing object address not the values, compiler maintains default object for -128 to 127
		// for other numbers it creates new object
		// above line of code converts to Integer num1 = Integer.ValueOf(180);
		
		if(num1 == num2)
		{
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}

}
