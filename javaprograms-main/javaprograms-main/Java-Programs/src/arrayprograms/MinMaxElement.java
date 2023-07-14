
// Find the minimum and maximum element in an array

// https://www.techcrashcourse.com/2016/04/java-program-find-maximum-minimum-element-array.html

package arrayprograms;

public class MinMaxElement {

	public static void main(String[] args) {
		
		int[] array =  {80, 30, 50, 40, 50, 60};
		minmax(array);
	}
	
	public static void minmax(int[] array)
	{
		int leng = array.length;
		int max, min;
		
		max = min = array[0];
		
		for(int i=0; i<=leng-1; i++)
		{
			if(array[i]> max)
			{
				max = array[i];
			}
			else if(array[i]< min)
			{
				min = array[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
