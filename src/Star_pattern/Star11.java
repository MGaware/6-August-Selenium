package Star_pattern;

public class Star11 
{
	// * * * * *
	//   * * * *
	//     * * * 
	//       * *
	//         * 
	//       * *
    //     * * *
	//   * * * *
	// * * * * *
	
	public static void main(String[] args) 
	{
		int star=5;
		int spaces=0;
		
		for(int a=1; a<=9; a++) 
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
			
			if(a<=4) 
			{
				star--;
				spaces++;
			}
			else 
			{
				star++;
				spaces--;
			}
			
			
			
			
			
		}
		
	}
}
