package Practice_core_java_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class javaCode_for_array_arrayList_map_set_base {

	void additionArray() {// addition of array
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

//******************************************************************************************

	void stringIntoMap() {// converts string into map
		String s = "yogesh Tayade";
		HashMap<String, String> hmap = new HashMap<>();
		hmap.put("name", s);
		System.out.println(hmap);
	}

//******************************************************************************************

	void lowestnumberfromarray() {// find a lowest number from the array
		int a[] = { 1, 2, 3, 4, 5 };
		int low = a[0];
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] < low) {
				low = a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(low);
	}

//******************************************************************************************
	
	void countofEvenOdddigitInArray() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("even= " + even);
		System.out.println("odd= " + odd);
	}

//******************************************************************************************

	void reverseArray() {
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i] + " ");
		}
	}

//******************************************************************************************

	void arrayIntoMap() {
		// convert array into map
		String[] s = { "yogesh", "ramesh", "tayade" };

		Map<Integer, String> hmap = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			hmap.put(i, s[i]);
		}
		System.out.println(hmap);
	}
	
// ******************************************************************************************

	void oddevenfromarrray() {
		int[] a = { 6, 2, 7, 3, 5 };

		System.out.println("odd numer");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("even number");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

//******************************************************************************************


//******************************************************************************************

	

//******************************************************************************************

	
	
//******************************************************************************************

	public static void main(String[] args) {
		javaCode_for_array_arrayList_map_set_base i = new javaCode_for_array_arrayList_map_set_base();

	}

}
