package Interview_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class company1_HMH {

	
	public void getmMaxNoFromArray_andDuplicateDataAlso()
	{// first print max no of the array
		int a[]= {2,6,5,7,4,2,8,9,4,2,8,88,74};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximum no from the array is " +max);
		HashMap <Integer,Integer> hm= new HashMap<Integer,Integer> ();
		for( int num :a )
		{
			hm.put(num, hm.getOrDefault(num, 0)+1);
		}
		System.out.println(hm);
	}
	
	public void data() {	
	String s[]= {"AKshay","Ajay","Pundkar","AKshay"};
	Map <String,Integer> hm= new LinkedHashMap <>();
	for (int i=0;i<=s.length-1;i++)
	{
		hm.put(s[i],i);
	}
	System.out.println(hm);
	}
	
	
	
	public static void main(String[] args) {


		company1_HMH obj= new company1_HMH();
			obj.getmMaxNoFromArray_andDuplicateDataAlso();
//		obj.data();
		
	}

}
