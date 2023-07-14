
// Java program to check whether an character is alphabet

package java_package;

public class AlphabetCheck {
	
	public static void main(String[] args) {

		char ch = 'Z';
		
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
		{
			System.out.println(ch+ " is an Alphabet");
		}
		else
		{
			System.out.println(ch+ " is not an Alphabet");
		}
	
		checkAlphabet('a');
	}
	
	public static void checkAlphabet(char ch)
	{
		int ascii = ch;
		if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122)
		{
			System.out.println(ch+ " is an Alphabet");
		}
		else
		{
			System.out.println(ch+ " is not an Alphabet");
		}
	}
}