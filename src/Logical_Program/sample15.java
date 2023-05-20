package Logical_Program;

public class sample15 
{
	//how to find duplicate element in array
	
	public static void main(String[] args) 
	{
		
		String ar[]= {"a","b","c","c"};
		
		for(int a=0; a<=ar.length-1; a++) 
		{
			for(int b=a+1; b<=ar.length-1; b++) 
			{
				if(ar[a]==ar[b]) 
				{
					System.out.println("duplicate element-"+ar[a]);
					
				}
				
			}
			
		}
		
	}

}
