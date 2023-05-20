package Logical_Program;

public class sample10 
{
	
	//find sum of elements in array
	
	public static void main(String[] args) 
	{
		
		int a[]= {10,10,10,10,10,10,10,10,10};	
		
		int sum=0;
		
		for(int b=0; b<=a.length-1; b++) 
		{
			sum=sum+a[b];
			
		}
		
		System.out.println(sum);
	}

}
