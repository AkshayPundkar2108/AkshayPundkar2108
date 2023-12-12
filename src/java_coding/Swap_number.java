package java_coding;

import java.util.Scanner;

public class Swap_number {

	public static void main(String[] args) {
		//without 3rd veriable 
		System.out.println("Enter the 1st value "); //input1=20
		Scanner sc =new Scanner (System.in);
			int	input1= sc.nextInt();
		System.out.println("Enter the 2nd value "); //input2=30
			int	input2= sc.nextInt();
			int input3;
//		input1= (input1+input2);
//		input2=(input1-input2);
//		input1= (input1-input2);
//		System.out.println(input1);
//	
//		System.out.println(input2);
//		
		//with third variable
		
		 input3= input1;
		 input1=input2;
		 input2=input3;
		System.out.println(input1 +" "+input2);
		
		
	}

}
