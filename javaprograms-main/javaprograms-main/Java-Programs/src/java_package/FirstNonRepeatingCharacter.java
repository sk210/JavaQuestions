package java_package;

//Java program to print first non repeating character

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) 
	{
		FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
		obj.firstNonRepeatChar("aabcdbe");	
	}
	
	public void firstNonRepeatChar(String str)
	{
		int size = str.length();
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		Character ch;

		for(int i=0; i< size; i++)
		{
		  ch = str.charAt(i);

		  if(counts.containsKey(ch))
		  {
		    counts.put(ch, counts.get(ch)+1);
		  }
		  else
		  {
		    counts.put(ch, 1);
		  }
		}

		for(int j=0; j< size; j++)
		{
		  ch = str.charAt(j);
		  if(counts.get(ch)==1)
		  {
		    str = String.valueOf(ch);
		    break;
		  }
		}
		    System.out.println(str);
	}

}
