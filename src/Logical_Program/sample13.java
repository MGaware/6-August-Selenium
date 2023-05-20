package Logical_Program;

public class sample13 
{
	
	//number of words present in a string 
	
		public static void main(String[] args) throws InterruptedException 
		{
			
			String org="welcome to java";
			int count=1;
			
			for(int a=0; a<=org.length()-1; a++) 
			{
				if((org.charAt(a)==' ') && (org.charAt(a+1)!=' ')) 
				{
					count++;
					
				}
				
			}
			System.out.println(count);
		}
		



}
