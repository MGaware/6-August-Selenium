package Logical_Program;

public class Reverse_Sentence 
{
	public static void main(String[] args) 
	{
	   String org="first step for study";	
		
		String sen=reversesentence(org);
		
		System.out.println(sen);
	}
	
	public static String reversesentence(String sentence) 
	{
		String [] ar=sentence.split(" ");
		
		String rev=" ";
		
		for(int a=ar.length-1; a>=0; a--) 
		{
			rev=rev+ar[a]+" ";
			
		}
		return rev;
		
		
	}










}
