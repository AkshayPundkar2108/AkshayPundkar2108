package Static_veriable_and_methods;

public class Static_variable {
		// the below variable is global variable /instance variable	
		String name ;
		String address ;
		static String city;
		
		 public Static_variable(String name,String address,String city)// this variable is only local vriable)
		{
				this.name = name;
				this.address=address;
				this.city=city;
		}
		 public void  getname()
		 {
			 System.out.println(name);
		 }
		 public void getaddress()
		 {
			 System.out.println(address);
		 }
		 public void getcity()
		 {
			 System.out.println(city);
		 }
		 public static void getdata()
		 {
			 System.out.println("Mydata");
		 }
		 
		 public void lala()
		 {
			 System.out.println(this.city);
		 }
		 
		public static void main(String[]args) {
			Static_variable obj= new Static_variable("akshay","Yerwada","Pune");
			 	obj.getname();
			 	obj.getaddress();
			 	obj.getcity();
			 	obj.lala();
			 	Static_variable.getdata();
			 System.out.println(Static_variable.city);
			 	
		}
		
		
		
		
}
