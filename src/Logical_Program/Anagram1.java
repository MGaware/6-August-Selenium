package Logical_Program;

import java.util.Arrays;

public class Anagram1 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		String a="tops";
		String b="stop";
		
		char[]c=a.toCharArray();
		char[]d=b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		
		boolean result=Arrays.equals(c, d);
		
		if(result==true) 
		{
			System.out.println("strings are anagram");
			
		}
		else 
		{
			System.out.println("strings are not anagram");
			
		}
	}
}
