package java_coding;

public class Reverse_string {

	public static void main(String[] args) {
		
		
		// string reverse
		
		String s = "Akshay Ajay Pundkar";
		for (int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("   **************");
		
		 // string print by chart wise print
		String s1 = "akshay ajay pundkar";
		for (int i=0; i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
		
		
	}

}
