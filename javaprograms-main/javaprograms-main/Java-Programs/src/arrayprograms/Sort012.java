
// Sort the array of 0s, 1s, and 2s

package arrayprograms;

import java.util.Arrays;

public class Sort012 {
	
	
public static void main(String[] args) {
		
		int[] array =  {0, 1, 2, 0, 2, 0, 1, 1, 0, 2, 0, 2, 1};
		sort(array);
	}
	

	public static void sort(int[] array)
	{		
		int leng = array.length;
		
		int[] temp = new int[leng];
		
		int[] numbers = {0, 1, 2};
		
		int size= numbers.length;
		
		int count=0;
		
		for(int i=0; i<=size-1; i++)
		{
			for(int j=0; j<=leng-1; j++)
			{
				if(numbers[i]==array[j])
				{
					temp[count] = numbers[i];
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(temp));
	}

}
