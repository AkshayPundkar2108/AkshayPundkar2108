package Practice_java_core;

public class stringClass {

	public static void main(String[] args) {
		
		String name = " akshay";
		String surname = "Pundkar ";
		System.out.println(name.charAt(2));	// finding the single alphabate :- s
		System.out.println(name.indexOf("h")); //  finding the h of index inside the name string :- 3
		System.out.println(name.substring(2) ); //  capture the statirng index of the string to end of the string index :- shay
		System.out.println(name.substring (3,5)); // capture the chooes index to chooes end index :- hay
		System.out.println(name.concat( "  Pundkar "));  // add two string to another string :- akshay Pundkar
		System.out.println(name.concat (" "+surname) ); //  add the two diferent string :- akshay Pundkar
		System.out.println(name.trim());  // removed the starting Spaces from the String :- akshay
		System.out.println(surname.trim());//removed the starting Spaces from the String :- Pundkar
		
	}

}
