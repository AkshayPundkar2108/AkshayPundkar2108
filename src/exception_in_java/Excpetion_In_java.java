package exception_in_java;

public class Excpetion_In_java {

	public static void main(String[] args) {
		
		int a=7;
		int b=0;
		int k=0;
		try 
		{
			k=a/b;
		}
		
//		catch (Exception e)
//		{
//			System.out.println("handle the exception");
//		}
//		
		 catch(ArithmeticException ae)
		{
			 System.out.println("handled the exception");
		}
	
		finally 
		{
		System.out.println("delete cookies");	
		}
		
		
	}

}
