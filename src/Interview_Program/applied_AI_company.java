package Interview_Program;

public class applied_AI_company {

	// ptint the max num from any integer array
//=========================================================================================================================================		
	public void  max_num_from_Int_array()
	{
		int a[]= {4,6,8,9,5};
		int max=a[0];
		for (int i=0;i<a.length-1;i++)
			{
			if (max<a[i])
			{max=a[i];}
			}
		System.out.println(max);
	}
//=========================================================================================================================================	
	public void min_num_From_int_array()
	{
		int a[]= {4,6,8,9,5};
		int min=a[0];
		for(int i=0;i<a.length;i++)
			{
			if( min>a[i])
			{min=a[i];}
			}
		System.out.println(min);
	}
//=========================================================================================================================================		
	public void print_repeated_value_from_String()
	{// output required like ay=3
		String a="AkshayAkshayAkshay";
		String substringToFind ="ay";
		int index=a.indexOf(substringToFind);
		int count=0; 
		while (index!=-1)
		{
			count++;
			index=a.indexOf(substringToFind, index +1);
		}
		System.out.println("ay= "+ count);
	}
	
//=========================================================================================================================================
	public static void main(String[] args) 
	{ 
		applied_AI_company ob= new applied_AI_company();
		
//		ob.max_num_from_Int_array();
//		ob.min_num_From_int_array();
		ob.print_repeated_value_from_String();	
		
		
		
		
		
		
		
		
	}

}
