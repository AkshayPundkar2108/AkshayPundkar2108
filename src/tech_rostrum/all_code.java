package tech_rostrum;

import java.util.HashMap;
import java.util.Map;

public class all_code {

	public void count_word() // occurance of word
	{
		String str ="i am learning learning java javajava Programming"; // this is the string value
		String[] st= str.split(" ");	// string converted into string array
	Map <String ,Integer> mp= new HashMap <>();
		int index =str.indexOf("Programming");// finding the index of the string value -> Programming=37;
		
	System.out.println(index);
	}
	
	
	
	public static void main(String[] args) {
		all_code object= new all_code();
		object.count_word();
		
		
		
		
	}

}
