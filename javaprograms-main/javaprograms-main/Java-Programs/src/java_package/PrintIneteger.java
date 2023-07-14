
// Java Program to print an integer Entered by the user

package java_package;

import java.util.Scanner;

public class PrintIneteger {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		System.out.println("Please Enter an Integer : ");
		
		int num = reader.nextInt();
		
		System.out.println("Entered Integer is : "+ num);
	}

}
