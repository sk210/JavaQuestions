
// Write a Java Program to reverse a string

package java_package;

public class ReverseAString {
	
	public static void main(String[] args) {
		ReverseUsing();
        Reverse();
	}
	
	// without using String inbuilt function.
	public static void ReverseUsing()
	{
		String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
        System.out.println(str2);
	}
	
	// without using String inbuilt function reverse()
	public static void Reverse()
	{
	        String str = "Testing Web";  // beW gnitseT
	        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
	        for(int i= chars.length-1; i>=0; i--) 
	        {
	            System.out.print(chars[i]);
	        }
	    }

}
