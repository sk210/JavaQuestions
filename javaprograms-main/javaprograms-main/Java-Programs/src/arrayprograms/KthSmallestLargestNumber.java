
// Find the Kth largest and Kth smallest number in an array

// https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/

package arrayprograms;

import java.util.Arrays;

public class KthSmallestLargestNumber {
	
	public static void main(String[] args) {
			
			int[] array =  {6, 8, 5, 11, 56, 1};
			KthSmallestNumber(array, 3);
			KthLargestNumber(array, 3);
		}
	
	public static void KthSmallestNumber(int[] array, int K)
	{		
		Arrays.sort(array);
		
		System.out.println("Smallest :"+array[K-1]);
	}
	
	public static void KthLargestNumber(int[] array, int K)
	{		
		int leng = array.length;
		
		Arrays.sort(array);
		
		System.out.println("Largest :"+array[leng-K]);
	}

}
