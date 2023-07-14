
// Write a program to reverse the array

package arrayprograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] array =  {10, 20, 30, 40, 50, 60};
		reverse(array);
	}
	
	public static void reverse(int[] array)
	{
		int leng = array.length;
		
		int[] rev = new int[leng];
		
		for(int i=leng-1, j=0; i>=0; i--, j++)
		{
			rev[j]= array[i];
		//	System.out.println(array[i]);
		}
		System.out.println(Arrays.toString(rev));
	}

}
