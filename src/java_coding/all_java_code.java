package java_coding;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;


public class all_java_code {

	

	void fibbonacieSeries()
	{//fibbonaci series 
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a + " " + b);
		for (int i = 2; i < 10; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}

	void countDigiIngienNumber() 
	{//count a digit in given number
		int num = 856974;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
			System.out.println(count);
		}
	}

	void someofGivennumber1() 
	{//some of given number 
		int num = 123456;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			System.out.println(sum);
			num = num / 10;
		}
	}
	void swappingNumber()
	{//swap number using third variable 
	int a=10;
	int b=100;
	System.out.println("before swapping= "+"a= "+a+" "+"b= "+b);

	int swap=a;
	a=b;
	b=swap;
	System.out.println("After swapping= "+"a= "+a+" "+"b= "+b);

	}
	void swapnumberwithoutThirdVariable()
	{//swap number without third variable 
	int a=20;
	int b=200;
	System.out.println("before swapping= "+"a= "+a+" "+"b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping= "+"a= "+a+" "+"b= "+b);

	}
	void reveresnumberusingwhileLoop()
	{//reverse number using while loop 
	int i=20;
	while(i>0)
	{
	System.out.println(i);i--;
	}
	}
	
	void reveresenumberusingforloop()
	{// reverse number using for loop 
		
	for(int i=10;i>=0;i--)
	{
	System.out.println(i);
	}
	}
	
	void stringvalueIntoInteger()
	{
		String s="1992";
		System.out.println(s);// this is also print as below print stament so dont know how it will be worked 
		int i=Integer.parseInt(s);
	   System.out.println(i);
	}
	public void joiners()
	{
		StringJoiner join=new StringJoiner(" ","[","]");
		join.add("get");
		join.add("rsult");
		join.add("into array form");
		System.out.println(join);
		
		
	}
	void removecharcter()
	{
		String str="Yogesh Ramesh Tayade";
		System.out.println("after removeing 'e'= "+str.replace("e", ""));
		
		System.out.println("aftere removing first 'e'= "+ str.replaceFirst("e", ""));
		
	}
	void oddevnwhileLoop()
	{//odd even number using whileloop 
	int i=0;
	while(i<20)
	{
	if(i%2==0)
	{
	System.out.println("even number="+i);
	}
	else
	{
	System.out.println("odd number= "+i);
	}i++;
	}
	}
	void checkAGivenNumberIsprime()
	{
		// prime number is divided by 1 only 
		int num=7;
		int temp=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%2==0)
			{
				temp=temp+1;
				break;
			}
		}
		if(temp==0)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
	void factorialNumber()
	{
		/*
		 * factorial number are those who is multiply than lower and equal 
		 * 4!=4*3*2*1=24
		 * 5!=5*4*3*2*1=120
		 * 6!=6*5*4*3*2*1
		 */
		
	  int num=4;
	  int fact=1;
	  for(int i=1;i<=num;i++)
	  {
		 fact=fact*i; 
	  }
	  System.out.println("factor of number "+fact);
	}
	void findgivenNumverisEvenorOdd()
	{
		int number=1991;
		if(number%2==0)
		{
			System.out.println("it is a even number");
		}
		else
		{
			System.out.println("it is a odd number");
		}
	}

	void oddevenforloop()
	{//odd even number using for loop 
	for(int i=10;i>=0;i--)
	{
	if(i%2==0)
	{
	System.out.println("this is even number= "+i);
	}
	else
	{
		System.out.println("THIS IS ODD NUMBER= "+i);
	}
	}
	}
void reverseString()
	 {//reverse string 
	 String name="Yogesh";
	 for(int i=name.length()-1;i>=0;i--)
	 {
	 System.out.println(name.charAt(i));
	 }
	 }
 void reverseonebyOne()
	  {//reverse string one by ine 
	 String name="Yogesh";
	 char c;
	 String rev=" ";
	 for(int i=name.length()-1;i>=0;i--)
	 {
	 c=name.charAt(i);
	 rev=rev+c;
	 System.out.println(rev);
	 }
	  }
	   
 
 void occurance()
	  {////give a count of character into string 
	 String s="lala lives in london";
	 int count=0;
	 for(int i=0;i<s.length();i++)
	 {
	 if(s.charAt(i)!=' ')
	 {
	 count++;
	 }
	 }
	 System.out.println("count of character in given string s= "+count );
	  }
 
 
void countofwordsinString()
	   {
//count a words in given string 
	  String s="lala lives in london";
	 //array
	  String [] wordcount=s.split(" ");
	  int count=wordcount.length;
	  System.out.println("count of words in goven sentence =" +count);
	   }
	 void countofLcharacterInSentence()
	{//give a count of single charater from string 
	  String s="lala lives in london";
	   char c='l';
	  int count=0;
	  for(int i=0;i<s.length();i++)
	  {
	  if(s.charAt(i)==c)
	  {
	 count++;  
	  }
	  }
	  System.out.println(count);

	    }
void ArrayIntoString()
	      {
	//convert array into string 
	     String []s= {"Yogesh","Tayade","search","job"};
	     String str=ConvertArraysToString(s);
	     System.out.println("arrays into string= "+str);
	      }
	 private String ConvertArraysToString(String[] s) {
	 // TODO Auto-generated method stub
	 return Arrays.toString(s);
	 }
	 
	 
	 void stringIntoArrays()//******************************
	 {
		 
		 String name="Yogesh tayade";
		 //Array
		 String []word=name.split(" ");
		 System.out.println(Arrays.toString(word));
     }
	 void removefirstandlastletter()
	 {//remove first and last character of the name 
	 String s="Yogesh";
	 String remove=s.substring(1,s.length() -1);
	 System.out.println(remove);
	 }
	
	 void additionArray()
	 {//addition of array 
	 int a[]= {1,2,3,4,5};
	 int sum=0;
	 for(int i=0;i<5;i++)
	 {
	 sum=sum+a[i];
	 }
	 System.out.println(sum);
	 }
	 
	 void findmaxnumber()
	 {//find a max number from the array 
		 
	 int a[]= {1,2,3,4,5};
	 int max=a[0];
	 for(int i=0;i<a.length;i++)
	 {
	 if(a[i]>max)
	 {
	 max=a[i];
	 }
	 }
	 System.out.println(Arrays.toString(a));
	 System.out.println(max);

	 }
	 
	 void findsecondmax()
	 {//find a second max number fro the array 
	 int a[]= {1,2,3,4,5};
	 int max=a[0];
	 int secondmax=a[0];
	 for(int i=0;i<a.length;i++)
	 {
	 if(a[i]>max)
	 {
	 secondmax=max;
	 max=a[i];
	 }
	 else if(a[i]>secondmax)
	 {
	 secondmax=a[i];
	 }
	 }
	 System.out.println(Arrays.toString(a));
	 System.out.println(secondmax);

	 }
	 
	 void lowestnumberfromarray()
	 {//find a lowest number from the array 
	 int a[]= {1,2,3,4,5};
	 int low=a[0];
	 for(int i=a.length-1;i>=0;i--)
	 {
	 if(a[i]<low)
	 {
	 low=a[i];
	 }
	 }
	 System.out.println(Arrays.toString(a));
	 System.out.println(low);
	 }
	 
	 void countofEvenOdddigitInArray()
	 {
		 int []a= {1,2,3,4,5,6,7,8,9};
		 int even=0;
		 int odd=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2==0)
			 {
				 even++;
			 }
			 else
			 {
				 odd++;
			 }
		 }
		 System.out.println("even= "+even);
			System.out.println("odd= "+odd);
	 }
	 
	 void reverseArray()
	 {
	 	int a[]= {1,2,3,4,5};
	 	for(int i=a.length-1;i>=0;i--)
	 	{
	 		System.out.println(a[i]+" ");
	 	}
	 }
	 void arrayIntoMap()
	 {
		 //convert array into map 
		 String []s= {"yogesh","ramesh","tayade"};
		 
		 Map<Integer,String> hmap=new HashMap<>();
		 for(int i=0;i<s.length;i++)
		 {
			hmap.put(i, s[i]) ;
		 }
		 System.out.println(hmap);
	 }
	 
	 void oddevenfromarrray()
	 {
	 	int []a= {6,2,7,3,5};
	 	
	 	System.out.println("odd numer");
	 	for(int i=0;i<a.length;i++)
	 	{
	 		if(a[i]%2!=0)
	 		{
	 System.out.println(a[i]);
	 		}
	 		
	 	}
	 	System.out.println("even number");
	 	for(int i=0;i<a.length;i++)
	 	{
	 		if(a[i]%2==0)
	 		{
	 			System.out.println(a[i]);

	 		}
	 	}
	 	

	 }
	 
	 void stringIntoMap()
	 {//converts string into map 
		 String s="yogesh Tayade";
		 HashMap<String,String> hmap=new HashMap<>();
		 hmap.put("name", s);
System.out.println(hmap);
		 
	 }
	 
	 
	 void giveCountOfUpperAndLowercharFromString()
	 {
		 String s="AxyZ";
		 
		 int upperchar=0;
		 int lowerchar=0;
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 if(ch>'A' && ch<='Z')
			 {
				 upperchar++;
			 }
			 else if(ch>'a' && ch<='z')
			 {
				 lowerchar++;
			 }
		 }
		 System.out.println("count of uppercharacter in string= "+upperchar);
		 System.out.println("count of lowercharacter in string= "+lowerchar);
	 }
	 void extractlowerAndUppercharacterInString()
	 {
		 String s="WelCome To IndiA";
		 String upperchar="";
		 String lowerchar="";
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 if(Character.isUpperCase(ch))
			 {
				 upperchar+=ch;
			 }
			 else if(Character.isLowerCase(ch))
			 {
				 lowerchar+=ch;
			 }
		 }
		 System.out.println("print a uppercharcter= "+upperchar);
		 System.out.println("print a lower charcter= "+lowerchar);
	 }
	 void giveCountOfUpperAndLowercharFromStrings() 
	 {
		    String s = "AxyZ";

		    int upperchar = 0;
		    int lowerchar = 0;

		    for (int i = 0; i < s.length(); i++) 
		    {
		        char ch = s.charAt(i);
		        if (Character.isUpperCase(ch)) 
		        {
		            upperchar++;
		        } else if (Character.isLowerCase(ch)) {
		            lowerchar++;
		        }
		    }

		    System.out.println("Count of uppercase characters in the string: " + upperchar);
		    System.out.println("Count of lowercase characters in the string: " + lowerchar);
		}
	 void substringofabcabc()
	 {
		 String input="yogesh";
		 
		 for(int i=0;i<input.length();i++)
		 {
			 for(int j=i+1;j<=input.length();j++)
			 {
				 String substring=input.substring(i, j);
				 
				 System.out.println(substring);
				 
			 }
			 
		 }
		 
	 }
	 void palindrom() {
		    String s = "madam";
		    String t = "";

		    for (int i = s.length() - 1; i >= 0; i--)
		    {
		        t = t + s.charAt(i);
		    }

		    System.out.println(t);

		    if (s.equals(t)) 
		    {
		        System.out.println("This is a palindrome: " + s);
		    }
		}
	 void initialfirstletterprint()
	 {
		 String s="yogesh ramesh tayade";
		 String str[]=s.split(" ");
		 for(int i=0;i<str.length;i++)
		 {
			 if(i<str.length)
			 {
				 System.out.println(str[i].charAt(0));
				 
			 }
		 }
	 }
	 
	 void removefirstandLastLetterfromName()
	 {
		 String s="yogesh";
		 for(int i=1;i<s.length()-1;i++)
		 {
			 System.out.println(s.charAt(i));
		 }
	 }
	 
	 void hh()
	 {
		 int a[]= {1,2,3,4,5,1,23,4,};
		 
		 Set set = new HashSet();
		 for(int duplicate:a)
		 {
			 //set.add(duplicate);
			 if(set.add(duplicate)==false)
			 {
				 System.out.println("this are the duplicates value= "+duplicate);
 
			 }
		 }
		 System.out.println("here we remove allduplicate value "+set);
		 
	 }
	 void trimandreverse()
	 {
		 String s="yogesh";
		 String remove=s.substring(1, s.length() -1);
		 System.out.println(remove);
		 System.out.println("***************");
		 
		 for(int i=remove.length()-1;i>=0;i--)
		 {
			 System.out.println(remove.charAt(i));
		 }
	 }
	 
	 
	 
	 void largestwordsFromString()
	 {
		 String s="lala live in London";
		 String sb[]=s.split(" ");
		 
		 for(int i=0;i<sb.length;i++)
		 {
			 for(int j=i+1;j<sb.length;j++)
			 {
				 if(sb[i].length()<sb[j].length())
				 {
					System.out.println(sb[j]); 
				 }
			 }
		 }
	 }
	 
	 void stringpalindrom()
	 {
		 String s="madam";
		 String sb="";
		 for(int i=0;i<s.length();i++)
		 {
			 sb=sb+s.charAt(i);
			 
		 }
		 if(s.equals(sb))
		 {
			 System.out.println("this is palindrom");
		 }
		 else
		 {
			 System.out.println("this is not palindrom");
		 }
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		all_java_code obj = new all_java_code();
		obj.additionArray();
	}


}
