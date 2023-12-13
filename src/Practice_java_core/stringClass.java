package Practice_java_core;

public class stringClass {

	public static void main(String[] args) {
		
		String name = " akshay";
		String surname = "Pundkar ";
		String FullName= "AKSHAY PUNDKAR";
		System.out.println(name.charAt(2));	// finding the single alphabate :- s
		System.out.println(name.indexOf("h")); //  finding the h of index inside the name string :- 3
		System.out.println(name.substring(2) ); //  capture the statirng index of the string to end of the string index :- shay
		System.out.println(name.substring (3,5)); // capture the chooes index to chooes end index :- hay
		System.out.println(name.concat( "  Pundkar "));  // add two string to another string :- akshay Pundkar
		System.out.println(name.concat (" "+surname) ); //  add the two diferent string :- akshay Pundkar
		System.out.println(name.trim());  // removed the starting Spaces from the String :- akshay
		System.out.println(surname.trim());//removed the starting Spaces from the String :- Pundkar
		System.out.println(name.toLowerCase());	// showing the string is in Lower case of the alphabatical :- akshay
		System.out.println(name.toUpperCase());// showing the string is in Upper case of the alphabatical  :- AKSHAY
		System.out.println(surname.toLowerCase());// showing the string is in Lower case of the alphabatical :- pundkar
		System.out.println(surname.toUpperCase());;// showing the string is in Upper case of the alphabatical  :- PUNDKAR
		 String array [] = FullName.split(" "); // spliting the two word in one string into the two string  by space 
		 										// Its generate two array index like array [0]= akshay and array [1] = Pundkar 
		System.out.println(array[0]);	// Print :- AKSHAY
		System.out.println(array[1]); 	// Print :- PUNDKAR
		
		
		
		
		
	}

}
