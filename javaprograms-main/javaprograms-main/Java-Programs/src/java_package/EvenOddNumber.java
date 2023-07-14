
//  java program to check whether even or odd number

package java_package;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number : ");
		
		int number = reader.nextInt();
		
		if(number % 2 == 0)
		{
		System.out.println("Entered number is Even");	
		}
		else
		{
			System.out.println("Entered number is Odd");	
		}
	}

}
