package Practice_core_java_code;

public class javaCode_for_interger_Base {

	void print_postive_number() {
		int a = 100;
		for (int i = 0; i <= a; i++) {
			System.out.print(i + ",");
		}
	}
	// or //
//*****************************************************************************************************

	void print_postive_number_without_loops(int start, int end) {
		if (start <= end)
			;
		System.out.println(start);
		print_postive_number_without_loops(start + 1, end);
	}
//*****************************************************************************************************		

	void print_minus_number() {
		int a = -100;
		for (int i = 0; i >= a; i--) {
			System.out.print(i + ",");
		}
	}

//*****************************************************************************************************		

	void print_addition_of_two_number() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

//*****************************************************************************************************	

	void print_swap_two_number_using_3rd_variable() {
		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println("given a of vlaue is " + a);
		System.out.println("given b of vlaue is " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("updated a of vlaue is " + a);
		System.out.println("updated b of vlaue is " + b);
	}

// *****************************************************************************************************

	void print_swap_two_number_without_3rd_variable() {
		int a = 10;
		int b = 20;
		System.out.println("given a of vlaue is " + a);
		System.out.println("given b of vlaue is " + b);
		a = (a + b); // 10+20=30=>a;
		b = (a - b); // 30-20=10=>b;
		a = (a - b); // 30-10=20=>a;
		System.out.println("updated a of vlaue is " + a);
		System.out.println("updated b of vlaue is " + b);
	}
	
//*****************************************************************************************************		

	void print_larger_no_of_between_two_number() {
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println(a + " is the grater number");
		} else {
			System.out.println(b + " is the grater number");
		}
	}
	
//*****************************************************************************************************	

	void print_larger_no_of_between_two_number_without_if_Else_condtion() {
		int a = 20;
		int b = 30;
		int larger = a > b ? a : b;
		System.out.println(larger + " this is the larger number");
	}
	
//*****************************************************************************************************	

	void print_sum_of_natural_number() {
		int a = 10;
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println(" sum of the 10th natural no is " + sum);
	}

//*****************************************************************************************************

	void print_sum_of_the_digit1() {
		int input = 12345;
		int sum = 0;
		while (input > 0) {
			sum = sum + input % 10;
			input = input / 10;
		}
		System.out.println(sum);
	}
	
//*****************************************************************************************************

	void print_the_average_of_number() {
		int a = 40;
		int b = 25;
		;
		int result = a + b;
		double average = result / 2.0;
		System.out.println("a and b value of the average value is " + average);
	}
//*****************************************************************************************************

	void print_reverse_no() {
		int a = 12345;
		int result = 0;
		while (a > 0) // a=firsttime=>12345,2ndtime=>1234,thirdtime=>123,fourthtime=>12,fifthtime=>1
		{
			result = a % 10; // 12345%10=> 1234 ..... 5 is removed from them and print into the console=>
								// asper that 2nd 123=>result 4
			a = a / 10; // 12345/10=> 1234.5 but we use the datatype as inter so a value is 1234 as per
						// that 2nd 123.4
		}
		System.out.println("reverse of the input is " + result);
	}

//*****************************************************************************************************

	void print_Number_Reverse() {
		int num = 54321;
		int reverse = 0;
		int remainder = 0;

		// Proper initialization in the for loop header
		for (int i = num; i != 0; i = i / 10) {
			remainder = i % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

	// or //

	void print_number_reverse_without_for_Loop() {
		int num = 54321;
		int reverse = 0;
		int remainder = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

//*****************************************************************************************************	

	void print_the_prime_number() {
		int a = 12; // prime number means when we divide the number by 1 or it self
		int result = 0;
		if (a % 2 == 0) {
			result = result + 1;
		}
		if (result == 0) {
			System.out.println(a + " input is prime number");
		} else {
			System.out.println(a + " input is not prime number");
		}
	}
//*****************************************************************************************************	

	void print_even_and_odd_number() {
		int a = 11;
		if (a % 2 == 0) {
			System.out.println(a + " = is even number");
		} else {
			System.out.println(a + " = is odd number");
		}
	}
//*****************************************************************************************************		

	void print_fibbonacie_Series() {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 2; i < 10; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}
//*****************************************************************************************************	

	void print_factorial_value() {
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

//*****************************************************************************************************	

	public static void main(String[] args) {
		javaCode_for_interger_Base obj = new javaCode_for_interger_Base();

		obj.print_Number_Reverse();

	}
}
