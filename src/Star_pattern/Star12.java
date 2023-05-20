package Star_pattern;

public class Star12 
{
	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	
	
	public static void main(String[] args) 
	{
		int star=05;
		
		for(int a=1; a<=9; a++) 
		{
		
			for(int b=1; b<=star; b++) 
			{
				
				System.out.print("*");
			}
			System.out.println();
			
			if(a<=4) 
			{
				star--;
				
			}
			else 
			{
				star++;
				
			}
			
			
			
			
		}
		
	}

}
