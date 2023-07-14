
// A Java program to find a peak element

// https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/

package arrayprograms;

public class PeakElement {

	public static void main(String[] args) {
		
		int[] array =  {80, 30, 50, 40, 50, 60};
		getPeakElement(array);
	}
	
	public static void getPeakElement(int[] array)
	{		
		int leng = array.length;
		
		if(array[0]>array[1])
		{
			System.out.println(array[0]);
		}
		
		if(array[leng-1]>array[leng-2])
		{
			System.out.println(array[leng-1]);
		}
		
		for(int i=1; i<=leng-2; i++)
		{
			if(array[i]> array[i-1] && array[i]> array[i+1])
			{
				System.out.println(array[i]);
			}
		}
	}

}
