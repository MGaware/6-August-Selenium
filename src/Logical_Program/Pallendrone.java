package Logical_Program;

public class Pallendrone 
{
	public static void main(String[] args) 
	{
		//string pallendrone
		String org="mom";
		String rev="";
		
		for(int a=org.length()-1;  a>=0;  a--) 
		{
			rev=rev+org.charAt(a);
			
		}
		
		
		if(rev.equals(org)) 
		{
			System.out.println("Given string is an pallendrone");
			
		}
		else 
		{
			System.out.println("Given string is not an pallendrone");
		}
		
		
		
		
		
         //int pallendrone
		String org1="12321";
		String rev1="";
		
		for(int a=org1.length()-1;  a>=0;  a--) 
		{
			rev1=rev1+org1.charAt(a);
			
		}
		
		
		if(rev.equals(org)) 
		{
			System.out.println("Given string is an pallendrone");
			
		}
		else 
		{
			System.out.println("Given string is not an pallendrone");
		}
		
		
		
		
		
		
		
	}

}
