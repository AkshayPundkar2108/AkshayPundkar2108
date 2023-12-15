package abstraction_abstract_class;

public class Small_House extends Big_House{
	
	public static void main(String[]Args)
	{
		Small_House  sh= new Small_House();
				sh.grandson();
				sh.grandFather();
				sh.grandMother();
//		Big_house bg= new Big_House();   we never create the object of the parent calss like  = Big_House 
	}

	@Override 
	public void grandson() {
		System.out.println("akshay is the grandson");
	}

}
