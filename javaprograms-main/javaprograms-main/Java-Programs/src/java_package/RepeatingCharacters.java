package java_package;

public class RepeatingCharacters {

	public static void main(
			String[] args) {
		RepeatingCharacters obj = new RepeatingCharacters();
		obj.repeartingcHaracters("Sakkett");
	}
	
	public void repeartingcHaracters(String str)
	{
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.print("Duplicate characters are: ");
        for (int i=0; i<str.length();i++) {
                    for(int j=i+1; j<str.length();j++) {
                               if (chars[i] == chars[j]) {
                                          System.out.print(chars[j]);
                                          System.out.print(", ");
                                          count++;
                                          break;
                                }
                     }
         }
        System.out.println("Total duplicate characters are :"+count);
	}

}
