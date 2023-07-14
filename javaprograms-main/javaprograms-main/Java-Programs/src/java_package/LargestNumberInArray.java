package java_package;

import java.util.Arrays;

public class LargestNumberInArray {
	
	public static int getLargest(int[] a, int total)
	{  
		int temp;  
		for (int i = 0; i < total; i++)   
		{  
		    for (int j = i + 1; j < total; j++)   
		    {  
		    int  s1= a[i];
		    int  s2= a[j];
		    
		      if (a[i] > a[j])   
		        {  
		          temp = a[i];
		          a[i] = a[j];
		          a[j] = temp;
		         }  
		     }  
		 }  
	  return a[total-1];  
	}  
	
	public static int getLargestBySort(int[] a, int total)
	{  
		Arrays.sort(a);  
		return a[total-1];  
	} 
	
	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};
		int c[]={44,99,66};
	//	System.out.println("Largest: "+getLargest(a,6));  
		System.out.println("Largest: "+getLargest(c,3));  
	//	System.out.println("Largest: "+getLargestBySort(b,7));
	}

}
