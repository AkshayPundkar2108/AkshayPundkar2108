package Interface_class_concept;

public class TraficRule implements foreignTrafic {
	
	
	

	public static void main(String[] args) 
	{
		foreignTrafic tr= new TraficRule();
		tr.greeGo();
		tr.redStop();
		tr.yellowSlow();
		TraficRule tr1 = new TraficRule();
		 tr1.stop();
		System.out.println(tr.num);
	}

	public void stop()
	{
		System.out.println("im stoping at the time of stop");
	}
	@Override
	public void greeGo()
	{
	System.out.println("greeGo");	
		
	}

	
	@Override
	public void redStop() 
	{
	System.out.println("redStop"); 			
	}

	@Override
	public void yellowSlow() 
	{
	System.out.println("yellowSlow");	
	}

}
