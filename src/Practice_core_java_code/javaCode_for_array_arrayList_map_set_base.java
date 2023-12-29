package Practice_core_java_code;

import java.util.HashMap;
import java.util.Map;

public class javaCode_for_array_arrayList_map_set_base {

	void print_reverse_Array() {
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i] + " ");
		}
	}

//******************************************************************************************

	void print_addition_of_Array() {// addition of array
		int[] a = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

//******************************************************************************************

	void print_string_into_map() {// converts string into map
		String s = "yogesh Tayade";
		HashMap<String, String> hmap = new HashMap<>();
		hmap.put("name", s);
		System.out.println(hmap);
	}

//******************************************************************************************

	void max_num_from_Int_array() {
		int a[] = { 4, 6, 8, 9, 5 };
		int max = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

//******************************************************************************************

	void print_min_num_from_Int_array() {
		int a[] = { 4, 6, 8, 9, 5 };
		int min = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

//******************************************************************************************

	void print_count_of_Even_Odd_digit_In_Array() {
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


	void print_odd_even_from_array() {
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

//******************************************************************************************

	public static void main(String[] args) {
		javaCode_for_array_arrayList_map_set_base o = new javaCode_for_array_arrayList_map_set_base();

		o.print_count_of_Even_Odd_digit_In_Array();
	}

}
