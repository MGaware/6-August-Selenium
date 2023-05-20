package Logical_Program;

public class sample11 
{
	//print even and odd numbers seperately
	
	public static void main(String[] args) 
	{
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		
		System.out.println("Even numbers in array");
		for(int b=0; b<=a.length-1; b++) 
		{
			if(a[b]%2==0) 
			{
				
				System.out.println(a[b]);
			}
			
			
		}
		
		System.out.println("Odd numbers in array");
		
		for(int c=0; c<=a.length-1; c++) 
		{
			if(a[c]%2!=0) 
			
				System.out.println(a[c]);
				
			
			
		}
		
		
	
	}

}
