package Star_pattern;

public class star13 
{
	//       *
	//     * * * 
	//   * * * * * 
	// * * * * * * *
	//   * * * * *
	//     * * *
    //       *
	
	public static void main(String[] args) 
	{
		int star=1;
		int spaces=3;
		
		for(int a=1; a<=7; a++) 
		{
		
			for(int b=1; b<=spaces; b++) 
			{
				System.out.print(" ");
				
			}
			
			for(int c=1; c<=star; c++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
			
			
			if(a<4) 
			{
				star=star+2;
				spaces--;
			}
			else 
			{
				star=star-2;
				spaces++;
			}
			
			
			
			
			
			
		}
		
		
	}
}
