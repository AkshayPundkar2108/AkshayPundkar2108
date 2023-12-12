package java_coding;

import java.util.Scanner;

public class Factorial_program {

	public static void main(String[] args) {
		System.out.println("Enter the factorial Value");
		Scanner sc = new Scanner(System.in);
		int factorial =sc.nextInt();
					// foactorial ex:- 5=5*4*3*2*1
		int result =1;
		for(int i=1; i<=factorial; i++)
		{
			 result= result*i;
		}
			System.out.println(result);
								
					
	}}
