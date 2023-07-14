
// Java program to design simple calculator

package java_package;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		
		double num1 = reader.nextDouble();
		double num2 = reader.nextDouble();
		
		System.out.println("Please enter operator : +, -, /, *");
		
		char ch = reader.next().charAt(0);
		
		double result = 0;
		
		switch (ch) {
		case '+': result = num1 + num2;
			break;
		case '-': result = num1 - num2;
		break;
		case '/': result = num1 / num2;
		break;
		case '*': result = num1 * num2;
		break;

		default: System.out.println("Please enter an valid operator");
			break;
		}
		System.out.println(result);
	}

}
