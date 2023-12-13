package java_coding;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {

//		System.out.println("enter the number");
//		Scanner sc =new Scanner (System.in);
//		int input=sc.nextInt();
		int input= 12345;
		int result=0;
		while (input>0) 
		{
		result = input%10;
		input=input/10;
		System.out.print(result);
		}
		
		
		
		
	}

}
