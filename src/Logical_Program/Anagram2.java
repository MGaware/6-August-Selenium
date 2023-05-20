package Logical_Program;

import java.io.IOException;
import java.util.Arrays;

public class Anagram2 
{
	
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		String a="SiLenT Is";
		String b="lIsTEN Si";
		
		String c=a.replace(" ", "");
		String d=b.replace(" ", "");
		
		
		
		String e=c.toLowerCase();
		String f=d.toLowerCase();
		
		
		
		char g[]=e.toCharArray();
		char h[]=f.toCharArray();
		
		Arrays.sort(g);
		Arrays.sort(h);
		
		boolean result=Arrays.equals(g, h);
		
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
