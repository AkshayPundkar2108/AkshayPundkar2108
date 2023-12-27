package Interview_Program;

public class company3_capgimini {


//	    public static void main(String[] args) {
//	        printNumbers(1, 100);
//	    }
//
//	    // Recursive function to print numbers from start to end
//	    public static void printNumbers(int start, int end) {
//	        if (start <= end) {
//	            System.out.println(start);
//	            printNumbers(start + 1, end);
//	        }
//	    }
//	}


 		void printWholeNumberWithoutAnyLoop(int start, int end)		// print 0 to 100
 		{		
 			if(start<=end)
 			{
 				System.out.println(start);
 				printWholeNumberWithoutAnyLoop(start+1,end);
 			}
 		}
 		
 		void printWholeNumberWithoutAnyLoop1(int start, int end)	// print 100 to 0
 		{		
 			if(start>=end)
 			{
 				System.out.println(start);
 				printWholeNumberWithoutAnyLoop1(start-1,end);
 			}
 			
 		}
	
 		public static void main (String[]args)
 		{
 			company3_capgimini obj =new company3_capgimini();
 			
// 			obj.printWholeNumberWithoutAnyLoop(0,100);
 			obj.printWholeNumberWithoutAnyLoop1(100,0);
 		}

 		
	

			
		
 		}

////question 1
//	    public static void main(String[] args) {
//	        double input1 = 3.44;
//	        double input2 = 3.67;
//
//	        int output1 = roundToNearestInteger(input1);
//	        int output2 = roundToNearestInteger(input2);
//
//	        System.out.println("Input: " + input1 + ", Output: " + output1);
//	        System.out.println("Input: " + input2 + ", Output: " + output2);
//	    }
//
//	    private static int roundToNearestInteger(double value) {
//	        // Multiply by 10 to preserve one decimal place
//	        double scaledValue = value * 10.0;
//
//	        // Round to the nearest integer
//	        double roundedValue = Math.round(scaledValue);
//
//	        // Divide by 10 to get the final result with one decimal place
//	        return (int) (roundedValue / 10.0);
//	    }
	    
	 
	    
	    
	    
	    
	    
	


