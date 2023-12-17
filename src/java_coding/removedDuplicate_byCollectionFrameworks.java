package java_coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class removedDuplicate_byCollectionFrameworks {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,2,5,8,7,4,3};
		int max = a[0];    
		for (int i = 0; i < a.length; i++) 
			{
				if (max < a[i]) 
				{
					max = a[i];
				}
			}
		System.out.println(max);
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
//        	for (int num : a) 
//        	{
//        		countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        	}	
//        	for (int i = 1; i <= max; i++) 
//        	{
//        		System.out.print(i + "=" + countMap.getOrDefault(i, 0) + ", ");
//        	}
//		
	}

}
