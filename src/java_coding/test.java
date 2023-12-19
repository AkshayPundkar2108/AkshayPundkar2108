package java_coding;

public class test {

	public class CountSubstring {
	    public static void main(String[] args) {
	        String a = "AkshayAkshayAkshay";
	        String substringToFind = "ay";

	        int index = a.indexOf(substringToFind);
	        int count = 0;

	        while (index != -1) {
	            count++;
	            index = a.indexOf(substringToFind, index + 1);
	        }

	        System.out.println("ay=" + count);
	    }
	}


}
