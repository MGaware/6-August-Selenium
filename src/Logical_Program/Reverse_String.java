package Logical_Program;



public class Reverse_String 
{
	
	public static void main(String[] args) 
	{
		String org="Mahesh";
		
		String rev="";
		
		for(int c=org.length()-1; c>=0; c--) 
		{
			rev=rev+org.charAt(c);
		 
		}
		System.out.println(rev);
		
		
		
		
        String org1="12321";
		
		String rev1="";
		
		for(int c=org1.length()-1; c>=0; c--) 
		{
			rev1=rev1+org1.charAt(c);
		 
		}
		System.out.println(rev1);
		
		
		
		
	}

}
