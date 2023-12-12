package java_coding;

import java.util.Scanner;

public class Power_of_number {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int input =sc.nextInt();
		System.out.println("Enter the power");
		int power= sc.nextInt();
		int result=1;
		for (int i=1; i<=power; i++)
		{
			result=input*result;
		}
			System.out.println(result);
	
		
		
			
		
		
	}

}
