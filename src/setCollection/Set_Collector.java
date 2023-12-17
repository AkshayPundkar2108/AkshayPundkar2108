package setCollection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Collector {

	public static void main(String[] args) {
			
			
		
			HashSet <String> hs = new HashSet <String> ();// with Data types base
			HashSet hs1= new HashSet();		//without  dataType base (generic)
			
			hs.add("Akshay");
			System.out.println(hs);
			hs.add("Ajay");
			System.out.println(hs);
			hs.addAll(hs);						// it doesnot take duplicate vlaue so the add all method is not working 
			System.out.println(hs);
			hs1.add(55);
			System.out.println(hs1);
			hs1.addAll(hs);					
			System.out.println(hs1);
			hs1.add(1);
			System.out.println(hs1);
			
			hs1.remove(55);
			System.out.println(hs1);
			hs1.remove(1);
			System.out.println(1);
			System.out.println(1);
//			 Iterator concept
		
			Iterator <String> it= hs.iterator();
			while(it.hasNext())
			{
			System.out.println(it.next());
			
			}
		
		
		
		
		
		
				
	}

}
