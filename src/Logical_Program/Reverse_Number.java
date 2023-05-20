package Logical_Program;

public class Reverse_Number 
{
	
	public static void main(String[] args) 
	{
		int org=5265;    //5625
		int rev=0;
		
		for(int a=org;    a>0;   a=a/10 ) 
		{
			int rem=a % 10;
			
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
		
		
	}

}
