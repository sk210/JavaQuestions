
// Asked in Amazon

// Reverse a string without changing the position of the words.

package java_package;

public class ReverseStringWIthoutChangingPosition {
	
			String str= "Test the product";
			
		    String arr[]=str.split(" ");
		    
		public void test() {      
		    for(int i=0;i<arr.length;i++)
		      {
		         for(int j=arr[i].length()-1;j>=0;j--)
		         {   
		        	 System.out.print(arr[i].charAt(j));
		         }
		          System.out.print(" ");
		      }
		   }
		
		public static void main(String[] args)
		{
			ReverseStringWIthoutChangingPosition object = new ReverseStringWIthoutChangingPosition();
			object.test();
		}
}