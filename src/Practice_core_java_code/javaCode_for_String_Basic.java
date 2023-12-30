package Practice_core_java_code;

public class javaCode_for_String_Basic {

	void print_remove_any_charcter_from_String() {
		String str = "Akshay Ajay Pundkar";
		System.out.println("after removeing 'a'= " + str.replaceAll("a", ""));
		System.out.println("aftere removing first 'k'= " + str.replaceAll("k", ""));
	}
//*****************************************************************************************************

	void print_reverse_string() {
		String name = "Akshay";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}

//*****************************************************************************************************	

	void print_reverse_one_by_One() {// reverse string one by line
		String name = "Yogesh";
		char c;
		String rev = " ";
		for (int i = name.length() - 1; i >= 0; i--) {
			c = name.charAt(i);
			rev = rev + c;
			System.out.println(rev);
		}
	}

//*****************************************************************************************************

	void print_occurance_in_string() { // give a count of character into string
		String s = "lala lives in london";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("count of character in given string s= " + count);
	}

//*****************************************************************************************************

	void print_chart_occurance_in_string() {
		String s = "akshay ajay pundkar";
		char ch = 'a';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("print the couunt A char: " + count);
	}

//*****************************************************************************************************	

	void maxword() {
		String s = "jalaUddin mohd akbr";
		String str[] = s.split(" ");
		String maxword = str[0];
		for (int i = 0; i < str.length; i++) {

			if (str[i].length() > maxword.length()) {
				maxword = str[i];
			}
		}
		System.out.println(maxword);
	}

//*****************************************************************************************************

	void print_count_of_words_in_string() {
		// count a words in given string
		String s = "lala lives in london";
		// array
		String[] wordcount = s.split(" ");
		int count = wordcount.length;
		System.out.println("count of words in given sentence =" + count);
	}

//*****************************************************************************************************

	void print_remove_first_and_last_letter_from_string() {// remove first and last character of the name
		String s = "akshay";
		String remove = s.substring(1, s.length() - 1);
		System.out.println(remove);
	}
	// or

	void remove_first_and_Last_Letter_from_Name() {
		String s = "yogesh";
		for (int i = 1; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

//*****************************************************************************************************

	void print_initial_first_letter_from_string() {
		String s = "akshay ajay pundkar";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (i < str.length) {
				System.out.println(str[i].charAt(0));
			}
		}
	}

//*****************************************************************************************************

	void print_palindrom_string() { // string
		String s = "madam";
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
		if (t.equals(s)) {
			System.out.println("This is a palindrome: " + s);
		}

	}

	void print_palindrome_number() {
		int num = 454;
		int sum = 0;
		int result = 0;
		int temp = 0;
		temp = num;
		while (num > 0) {
			result = num % 10;
			sum = (sum * 10) + result;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome");
		}
	}
//*****************************************************************************************************

	void print_trim_and_reverse() {
		String s = "yogesh";
		String remove = s.substring(1, s.length() - 1);
		System.out.println(remove);
		System.out.println("***************");

		for (int i = remove.length() - 1; i >= 0; i--) {
			System.out.println(remove.charAt(i));
		}
	}

//*****************************************************************************************************

	void print_largest_words_From_String() {
		String s = "lala live in London";
		String sb[] = s.split(" ");

		for (int i = 0; i < sb.length; i++) {
			for (int j = i + 1; j < sb.length; j++) {
				if (sb[i].length() < sb[j].length()) {
					System.out.println(sb[j]);
				}
			}
		}
	}

//*****************************************************************************************************

	void giveCountOfUpperAndLowercharFromString() {
		String s = "AxyZ";
		int upperchar = 0;
		int lowerchar = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch > 'A' && ch <= 'Z') {
				upperchar++;
			} else if (ch > 'a' && ch <= 'z') {
				lowerchar++;
			}
		}
		System.out.println("count of uppercharacter in string= " + upperchar);
		System.out.println("count of lowercharacter in string= " + lowerchar);
	}

//*****************************************************************************************************

	void giveCountOfUpperAndLowercharFromStrings() {
		String s = "AxyZ";

		int upperchar = 0;
		int lowerchar = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperchar++;
			} else if (Character.isLowerCase(ch)) {
				lowerchar++;
			}
		}

		System.out.println("Count of uppercase characters in the string: " + upperchar);
		System.out.println("Count of lowercase characters in the string: " + lowerchar);
	}

//*****************************************************************************************************

	void print_repeated_value_from_String() {// output required like ay=3
		String a = "AkshayAkshayAkshay";
		String substringToFind = "ay";
		int index = a.indexOf(substringToFind);
		int count = 0;
		while (index != -1) {
			count++;
			index = a.indexOf(substringToFind, index + 1);
		}
		System.out.println("ay= " + count);
	}

//*****************************************************************************************************

	public static void main(String[] args) {
		javaCode_for_String_Basic obj = new javaCode_for_String_Basic();
		obj.print_trim_and_reverse();

	}

}
