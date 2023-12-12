package java_coding;

import java.util.Scanner;

public class Count_the_digit {

	public static void main(String[] args) {
		
		//3456= 4digit
		System.out.println("Please enter the value ");
		 Scanner sc =new Scanner (System.in);
		 int value=sc.nextInt();
		 int result=0;
		while(value>0) 
		{
			value=value/10;
			result++;
		}
		
		System.out.println(result);
	
		
}
		
	}
	
	

