package hashMap_collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashMap_collection {

	public static void hashmapdata()
	{
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sn= hm.entrySet();
		Iterator it =sn.iterator();
		//hashtable -pass table set collections 
		while(it.hasNext())
		{
		System.out.println(it.next());
		Map.Entry mp=(Map.Entry)it.next();//
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		}
	}

		// HashSet
		public static void main(String[] args) {
			HashMap_collection.hashmapdata();
		//HashSet treeset, LinkedHashset implements Set interface
		//does not accept duplicate values 
		// There is no guarantee elements stored in sequential order..Random order

		HashSet<String > hs= new HashSet<String>();
		hs.add("USA");
		System.out.println(hs);
		hs.add("UK");
		System.out.println(hs);
		hs.add("INDIA");
		System.out.println(hs);
		hs.add("he");
		System.out.println(hs);
		hs.add("she");
		System.out.println(hs);
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}




		}
		
		
		
		
	}


