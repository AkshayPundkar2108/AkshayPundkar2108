package java_coding;

import java.util.Scanner;

public class Average_finding {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		int input1 = sc.nextInt();
		System.out.println("Please enter value");
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int input4 = sc.nextInt();
		int input5 = sc.nextInt();
		int result=input1+input2+input3+input4+input5;
		
		double average=result/5.0;
		
		System.out.println(average);
	}

}
