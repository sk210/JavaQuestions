
// Move all the negative elements to one side of the array

package arrayprograms;

import java.util.Arrays;

public class MoveNegativeNumbers {

	public static void main(String[] args) {
		
		int[] array =  {15, -2, 4, 8, -9, 5, 10, -23, -1, -10};
		move(array);
	}
	
	public static void move(int[] array)
	{
		int leng = array.length;
		System.out
			.println(leng);
		int j = 0, temp;
        for (int i = 0; i <= leng-1; i++) 
        {
            if (array[i] < 0) 
            {
                if (i != j) 
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
	}

}
