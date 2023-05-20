package Logical_Program;

import java.util.Arrays;

public class sample12 
{
	
	//how to check the equality of two arrays
	
	public static void main(String[] args) 
	{
		
		int a[]= {1,2,3,4,5,6};
		
		int b[]= {1,2,3,4,5};
		
		boolean result=Arrays.equals(a, b);
		
		if(result==true) 
		{
			
			System.out.println("both arrays are equal");
		}
		else 
		{
			
			System.out.println("both arrays are not equal");
		}
		
		
		
	}

}
