package Practice_core_java_code;

public class javaCode_for_String_Basic {

		void print_remove_any_charcter_from_String()
		{
			String str="Akshay Ajay Pundkar";
			System.out.println("after removeing 'a'= "+str.replaceAll("a", ""));
			System.out.println("aftere removing first 'k'= "+ str.replaceAll("k", ""));
		}
	
		void print_reverse_string()
		 {
			String name="Akshay";
			for(int i=name.length()-1;i>=0;i--)
			{
			System.out.println(name.charAt(i));
			}
		 }
		void print_reverse_one_by_One()
		  {//reverse string one by line 
		 String name="Yogesh";
		 char c;
		 String rev=" ";
		 for(int i=name.length()-1;i>=0;i--)
		 {
		 c=name.charAt(i);
		 rev=rev+c;
		 System.out.println(rev);
		 }
		  }
		
		 void print_occurance_in_string()
		  {////give a count of character into string 
		 String s="lala lives in london";
		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)!=' ')
			 { count++; }
		 }
		 System.out.println("count of character in given string s= "+count );
		  }
		 
		 void print_chart_occurance_in_string()
	      {
	    	  String s="akshay ajay pundkar";
	    	  char ch='a';
	    	  int count=0;
	    	  for (int i=0; i<s.length(); i++)
	    	  {
	    		  if(s.charAt(i)==ch)
	    		  {
	    			  count ++;
	      		  }
	    	  }
	    	  System.out.println("print the couunt A char: "+count);
	    	  }
	 
	 
		
	
	public static void main(String[] args) {
		javaCode_for_String_Basic obj= new javaCode_for_String_Basic();
		obj.print_reverse_one_by_One();
	
	
	
	
	
	
	
	
	
	
	}

}
