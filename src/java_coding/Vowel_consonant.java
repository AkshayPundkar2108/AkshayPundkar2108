package java_coding;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {

			System.out.println("Enter the charector");
			Scanner sc = new Scanner(System.in);
				char input= sc.next().charAt(0);
				if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
				{
					System.out.println(" this is vowels" );
				}
				else {
					System.out.println("this is the Consonent" );
				}
			
		
		
		
	}

}
