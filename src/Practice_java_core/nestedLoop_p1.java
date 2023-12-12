package Practice_java_core;

public class nestedLoop_p1 {

	public static void main(String[] args) {
			
		
//		 for (int i=0; i<=5; i++)
//		 {
//			
//			 	for(int j=1;j<=5-i;j++)
//			 	{
//			 		System.out.print(s);	
//			 	}
//			 System.out.println("  ");
//		 }		
//--------------------------------------------------------------------------------------
		//output 
//		 akshayakshayakshayakshayakshay  
//		 akshayakshayakshayakshay  
//		 akshayakshayakshay  
//		 akshayakshay  
//		 akshay
//=========================================================================================
			int k=1;
		for (int i=0; i<=4; i++)
			 {
//				System.out.println("outer lop start");
				 	for(int j=1;j<=4-i;j++)
				 	{
				 		System.out.print(k+ " ");
				 		k++;	
				 	}
				 	System.out.println("  ");
//				 	System.out.println("outer lop end");
			 }		
		//output 					
//		1 2 3 4   
//		5 6 7   
//		8 9   
//		10 
		  
//===========================================================================================		
	int x=1;
	for (int i=1;i<=4;i++)
	{
		for  (int j=1; j<=i; j++)
		{
			System.out.print(x+" ");
			x++;
		}
		System.out.println(" ");
	}
			
	//output 					
//	1  
//	2 3  
//	4 5 6  
//	7 8 9 10  

		      
//===========================================================================================		
		
		
		
		
	}}


//====================================================================================================

