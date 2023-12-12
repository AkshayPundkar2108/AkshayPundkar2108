package java_coding;

import java.util.Scanner;

public class Sum_of_the_Digit {

	public static void main(String[] args) {

		
		System.out.println("please enter the number");
				 Scanner sc =new Scanner (System.in);
				 int input =sc.nextInt();
				 int sum;
				 int result=0;
				 while(input>0)
				 {
					 sum=input%10;
					 result=result+sum;
					 input=input/10;
				 }
				 System.out.println("addition of input is  " + result);

	}

}
