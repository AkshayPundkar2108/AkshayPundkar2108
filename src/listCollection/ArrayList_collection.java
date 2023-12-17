package java_collection_listCollection;

import java.util.ArrayList;

public class ArrayList_collection {

	public static void main(String[] args) {

			ArrayList<String> a= new ArrayList<String>();
			ArrayList<String> b= new ArrayList<String>();
			
			a.add("akshay");	// adding the single arry with any index 
			System.out.println(a);
			a.add(1,"Ram");		// adding the single array with index postion  of array 
			System.out.println(a); 
			System.out.println(a.contains("Ram"));
			System.out.println(a.isEmpty());
			System.out.println(a.size());
//			System.out.println(a.remove(0));
//			System.out.println(a.remove(0));
			System.out.println(a.get(0));
			System.out.println(a.get(1));
			
			a.addAll(a);		// passing the value from the same (a) clloection to same collection(a)
			System.out.println(a);	// printing the 1st collection data into the first collection 
			 
			b.addAll(a);		// passing the value from diffrent collection (a) to diffrent collection(b)
			System.out.println(b);	// printing the ast collection data into the second collection
//			System.out.println(b.remove(0));
//			System.out.println(b.remove(0));
			System.out.println(b.contains("Ram"));
			System.out.println(b.isEmpty());
			System.out.println(b.size());
			System.out.println(b.get(0));
			System.out.println(b.get(1));
			System.out.println(b.get(2));
			System.out.println(b.get(3));
	}

}
