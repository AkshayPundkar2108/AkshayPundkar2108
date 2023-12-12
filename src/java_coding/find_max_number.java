package java_coding;

import java.util.Scanner;

public class find_max_number {

	public static void main(String[] args) {
//		System.out.println("Enter the first number");
//		Scanner sc =new Scanner (System.in);
//		int input1= sc.nextInt();
//		System.out.println("Enter the second number");
//		int input2= sc.nextInt();
//		int larger= input1>input2?input1:input2;
//		System.out.println(larger + " this is the largest number");
		
		// using if and else
//		 int input1 = 10;
//		 int input2 = 20;
//		if	(input1>input2)
//			 {
//			System.out.println(input1);
//			 }
//		else {
//			System.out.println(input2);
//			 }

		// find the largest lumber from 3 number
		System.out.println("Enter the first number");
		Scanner sc =new Scanner (System.in);
		int input1= sc.nextInt();
		System.out.println("Enter the second number");
		int input2= sc.nextInt();
		System.out.println("Enter the third number");
		int input3= sc.nextInt();
		
		if (input1>input2) 
		{
			if (input1>input3) 
				System.out.println("the first number is greater "+input1);
			else 
			System.out.println("the first number is greater "+input3);
		}
		else {
			if (input2>input3) 
			System.out.println("the second number is greater "+input2);
			else 
				System.out.println("the second number is greater "+input3);
			}
		}
	}
		

		
			
	


