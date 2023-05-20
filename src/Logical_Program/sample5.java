package Logical_Program;

public class sample5 
{
	//count sum of digits in a number
	
		public static void main(String...args) 
		{
			int org=123111254;
			int sum=0;
			
			while(org>0) 
			{
				int rem=org%10;
				sum=sum+rem;
				org=org/10;
			}
			
			System.out.println("total sum of number-"+sum);
			
			
		}

}
