package Logical_Program;

public class sample8 
{
	
	//factorial of a number
	
		public static void main(String...args) 
		{
			int num=9;   //factorial means 1*2*3*4*5*6*7*8*9= factorial
			int factorial=1;
			
			for(int a=1; a<=num; a++) 
			{
				factorial=factorial * a ;
				
			}
			
			System.out.println(factorial);
			
		}

}
