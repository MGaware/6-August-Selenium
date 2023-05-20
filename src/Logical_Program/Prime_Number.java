package Logical_Program;

public class Prime_Number 
{
	
	public static void main(String[] args) 
	{
		int org=11;
		int count=0;
		
		for(int a=2;   a<org;   a++ ) 
		{
			
			if(org % a==0) 
			{
				count++;
				break;
				
			}
			
			
			
		}
		
		if(count==1) 
		{
			System.out.println("11 number is not a prime number");
			
		}
		else 
		{
			
			System.out.println("11 number is an prime number");
		}
		
		
		System.out.println("--------------------------------------------------------");
		
		
		
		

		int org1=12;
		int count1=0;
		
		for(int a=2;   a<org1;   a++ ) 
		{
			
			if(org1 % a==0) 
			{
				count1++;
				break;
				
			}
			
			
			
		}
		
		if(count1==1) 
		{
			System.out.println("12 number is not an prime number");
			
		}
		else 
		{
			
			System.out.println("12 number is an prime number");
		}
		
		
	}

}
