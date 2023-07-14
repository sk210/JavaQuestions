
 // Java program to check whether an alphabet is vowel or consonant

package java_package;

public class VowelAndConsonant {

	public static void main(String[] args) {

		char ch = 'a';
		
		// Method 1
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch +" is Vowel");
		}
		else
		{
			System.out.println(ch +" is Consonant");
		}
		
		// Method 2
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch +" is Vowel");
			break;

		default:
			System.out.println(ch +" is Consonant");
			break;
		}
	}

}
