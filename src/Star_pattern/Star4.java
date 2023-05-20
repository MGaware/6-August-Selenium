package Star_pattern;

public class Star4 
{
	// *
	// * *
	// * * * 
	// * * * *
	// * * * * *
	
	public static void main(String[] args) 
	{
		int star=1;
		
		for(int a=1; a<=5; a++)     //for row                    
		{
			
			
			for(int b=1; b<=star; b++)   //for star
			{
				
				System.out.print("*"+" ");
			}
			System.out.println();
			star++;
			
			
			
			
		}
		
	}
	

}
