
// Write a program to sort the given array

package arrayprograms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] array =  {6, 8, 5, 11, 56, 1};
		sortArray(array);
	}
	
	public static void sortArray(int[] array)
	{
		int leng = array.length;
		int temp = 0; 
		
		for (int i = 0; i < leng; i++) 
		{ 
	        for (int j = i+1; j < leng; j++) 
	         { 
	        	if(array[i] > array[j])  // > for ascending and < for descending
	        	{ 
	               temp = array[i]; 
	               array[i] = array[j]; 
	               array[j] = temp; 
	        	} 
	          }
		}
		System.out.println(Arrays.toString(array));
	}

}
