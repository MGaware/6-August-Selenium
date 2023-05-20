package Logical_Program;

public class Armstrong_Number 
{
	
	public static void main(String[] args) 
	{
		int org=9474;
		int sum=0;
		
		
		
	
		for(int a=org;    a>0;     a=a/10) 
		{
			
			int rem=a % 10;
			
			sum=sum+(rem*rem*rem);
			
		}
		
		if(org==sum) 
		{
			
			System.out.println("Given number is an armstrong number");
		}
		else 
		{
			
			System.out.println("Given number is an armstrong number");
		}
		
		
	}

}
