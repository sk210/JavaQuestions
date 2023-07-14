
// Find the occurrence of an integer in the array

package arrayprograms;

import java.util.HashMap;

public class CountOccurences {

	public static void main(String[] args) {
		
		int[] array =  {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8, 2 };
	//	countOccOfNumber(array, 2);
		countOccOfNumber(array);
	}
	
	public static void countOccOfNumber(int[] array, int K)
	{		
		int leng = array.length;
		
		int count = 0;
		
		for(int i=0; i<=leng-1; i++)
		{
			if(K==array[i])
			{
				count++;
			}
		}
		System.out.println("Occurence of "+K+" in array is : "+count);
	}
	
	public static void countOccOfNumber(int[] array)
	{
		HashMap<Integer, Integer> map=  new HashMap<Integer, Integer>();
		
		int leng =  array.length;
		
		for(int i=0; i<=leng-1; i++)
		{
			if(map.containsKey(array[i]))
			{
				map.put(array[i], map.get(array[i])+1);
			}
			else
			{
				map.put(array[i], 1);
			}
		}
		System.out.println(map);
	}

}
