
// Subarray with given Sum

package arrayprograms;

public class SubarraySum {

	public static void main(String[] args) {

		int[] array =  {15, 2, 4, 8, 9, 5, 10, 23};
		int sum = 23;
		subarraysum(array, sum);
	}
	
	public static void subarraysum(int[] array, int sum)
	{
		int leng= array.length;
		
		for(int i=0; i<=leng-1; i++)
		{
			int currentsum = array[i];
			
			if(currentsum==sum)
			{
				System.out.println("sum indexes are :"+array[i]);
			}
			else
			{
				for(int j=i+1; j<=leng-1; j++)
				{
					currentsum += array[j];
					if(currentsum ==sum)
					{
						System.out.println("sum indexes are :"+i+" and "+j);
					}
				}
			}
		}
	}

}
