package java_coding;

import java.util.Scanner;

public class Palindrome_number_and_string {

	
	
	
	
	
	public static void main(String[] args) {
		
		         
		      System.out.println("Enter a string/number to check if it is a palindrome");  
		      Scanner sc = new Scanner(System.in); 
		      String original = sc.nextLine();   
		      int length = original.length();   
//			  String  original="madam";
		      String  reverse = "";
		      for ( int i = original.length()-1; i >= 0; i-- )  
		          reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");   
		    

	}

}
