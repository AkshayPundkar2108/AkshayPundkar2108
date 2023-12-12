package java_coding;

import java.util.Scanner;

public class odd_even_number {

	public static void main(String[] args) {

	System.out.println("enter The number");
	Scanner sc = new Scanner(System.in);
	int uservalue=sc.nextInt();
	if (uservalue%2==0)
	{
		System.out.println(uservalue+ " is Even Number" );
		}
	else {
		System.out.println(uservalue+" is odd number"  );
	}
		
	
	
	}

}
