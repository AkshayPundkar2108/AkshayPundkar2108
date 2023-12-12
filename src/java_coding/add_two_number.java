package java_coding;

import java.util.Scanner;

public class add_two_number {

	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		int c=a+b;
//		System.out.println("if a=10 and b=20 then addition of a and b is "+c);
//		
		
		// by using user input 
		int a;
		int b;
		int usernum;
			System.out.println("Enter the first Number");
			Scanner Sc =new Scanner (System.in);
			a =Sc.nextInt();
			System.out.println("Enter The  second Number");
			b =Sc.nextInt();
			usernum =a+b;
			{
			System.out.println("addition of First And second value Is " +usernum);
			}
		
	}

}
