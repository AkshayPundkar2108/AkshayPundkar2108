package Interview_Program;

import java.util.ArrayList;
import java.util.HashMap;

public class HMH_company {
	
	public void findTheMaxNofromArray()
	{
		int a[]= {5,8,9,3,7,66,2,5,9,8,7,2,11,58};
		int max = a[0];
		for( int i=0; i<a.length;i++)
		{
			if(a[i]>max)
			{
				a[i]=max;
			}
		}
		System.out.println(max);
	}
	
	ArrayList<Integer> al= new ArrayList<Integer>();
	HashMap <Integer,Integer> hm= new HashMap<Integer,Integer>();
	
	
	
	
	
	
	
	
	public void main(String[]args)
	{
		HMH_company ob= new HMH_company();
		ob.findTheMaxNofromArray();
																									
		
	}

}
															