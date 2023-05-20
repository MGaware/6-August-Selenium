package Star_pattern;

public class Star7 
{
	// * * * * * *
	//   * * * * *
	//     * * * *
	//       * * * 
	//         * * 
    //           *     
	
	public static void main(String[] args) 
	{
		int star=6;
		int spaces=0;
		
		for(int a=1; a<=6; a++) //for loop for row
		{
			
		       for(int b=1; b<=spaces; b++)   //for loop for spaces
		       {
		    	   System.out.print(" ");
		    	   
		       }
		       
		       for(int c=1; c<=star; c++)     //for loop for star
		       {
		    	   System.out.print("*");
		    	   
		       }
		       System.out.println();
		       star--;
		       spaces++;
		       
			
			
			
			
		}
		
	}
}
