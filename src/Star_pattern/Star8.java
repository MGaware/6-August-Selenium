package Star_pattern;

public class Star8 
{
	
	//         *          pyramid star pattern
	//       * * * 
	//     * * * * * 
	//   * * * * * * * 
	// * * * * * * * * * 
	
	public static void main(String[] args) 
	{
		int star=1;
		int spaces=4;
		
		for(int a=1; a<=5; a++) 
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
			
			spaces--;
			star=star+2;
			
			
			
			
		}
		
		
		
	}

}
