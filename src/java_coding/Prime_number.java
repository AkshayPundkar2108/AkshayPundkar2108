package java_coding;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
	
		System.out.println("Print the number" );
		Scanner sc = new Scanner(System.in);
	 	int input= sc.nextInt();
	 	int count=0;
	 	
	 // prime number is divided by 1 only 
	 		
	 		int result=0;
	 		for(int i=2;i<input/2;i++)
	 			{
	 		if(input%2==0)
	 				{
	 				result=result+1;
	 				}
	 			}
	 		if(result==0)
	 			{
	 			System.out.println("number is prime");
	 			}
	 		else
	 			{
	 			System.out.println("number is not prime");
	 			}
	 	
		
	}

}
