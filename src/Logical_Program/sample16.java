package Logical_Program;

public class sample16 
{
	//fibonacci series
	
	public static void main(String[] args) 
	{
		
		int n1=0; 
		int n2=1;
		int sum=0;
		
		for(int a=2; a<20; a++) 
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
				
		
	}

}
