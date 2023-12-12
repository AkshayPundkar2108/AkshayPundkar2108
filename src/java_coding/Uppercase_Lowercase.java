package java_coding;

import java.util.Scanner;

public class Uppercase_Lowercase {

	public static void main(String[] args) {
		System.out.println("Please Enter the charector");
		Scanner sc = new Scanner (System.in);
		char input =sc.next().charAt(0);
		char Result;
		if (input>='A'&& input<='Z')
		{
			Result= Character.toLowerCase(input);
			System.out.println(Result);
		}
		else 
		{
			Result= Character.toUpperCase(input);
			System.out.println(Result);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
