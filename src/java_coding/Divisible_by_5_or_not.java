package java_coding;

import java.util.Scanner;

public class Divisible_by_5_or_not {

	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner sc =new Scanner(System.in);
		int  input =sc.nextInt();
		
		if (input%2==0)
		{
			System.out.println("this is divisible by 2");
		}
		else
		{
			System.out.println("this is not divisible by 2 ");
		}
		
	
	}

}
