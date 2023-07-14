package arrayprograms;

public class UnionAndIntersection {

	public static void main(String[] args) {
		
		int[] array1 =  {10, 20, 60, 30, 90, 50};
		int[] array2 =  {60, 30, 80, 70, 40, 10};
		union(array1, array2);
	}
	
	public static void union(int[] array1, int[] array2)
	{
		int leng1 = array1.length;
		int leng2 = array2.length;
		
		int[] resultarray = array1;
		
		for(int i=0; i<=leng2-1; i++)
		{
			for(int j=0; i<=leng1-1; i++)
			{
				if(array1[i]==array2[i]) 
				{
					
				}
			}
		}
	}

}
