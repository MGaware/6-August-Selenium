package Logical_Program;

public class sample4 
{
	
	//count numbers of even and odd digits in a number
	
		public static void main(String...args) 
		{
			long org=7854758965276l;
			
			int evencount=0;
			int oddcount=0;
			
			while(org>0) 
			{
				long rem=org%10;
				if(rem%2==0) 
				{
					evencount++;
					
				}
				else 
				{
					oddcount++;
					
				}
				org=org/10;
				
				
				
			}
			System.out.println("even count- "+evencount);
			System.out.println("odd count- "+oddcount);
			
			
			
			
		}

}
