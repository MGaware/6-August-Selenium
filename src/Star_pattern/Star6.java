package Star_pattern;

public class Star6 
{
	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	
	public static void main(String[] args) 
	{
		int star=5;
		
		for(int a=1; a<=5; a++) 
		{
			
			for(int b=1; b<=star; b++) 
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
			star--;
			
		}
		
	}

}
