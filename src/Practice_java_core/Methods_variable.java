package Practice_java_core;

public class Methods_variable {

		// creating the method outside of the main class
	
	public void  getdata() 
		{
			System.out.println("my data");
		}
	// creating the veriable out side of the main class
	int number= 10;
	// accessing the the Methods_variable  
	
	public static void main(String[] args) {
		Methods_variable mv= new Methods_variable();
		System.out.println(mv.number);
		mv.getdata();

		
		
		
		
		
	}

}
