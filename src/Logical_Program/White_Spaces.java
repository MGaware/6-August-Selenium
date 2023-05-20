package Logical_Program;

public class White_Spaces 
{
	
	public static void main(String[] args) 
	{
		
		String org="ab b nhd ndh n n j";
		int count=0;
		
		for(int a=0; a<=org.length()-1; a++) 
		{
			char charvalue=org.charAt(a);
			
			if(charvalue==' ') 
			{
				count=count+1;
				
			}
			
		}
		System.out.println(count);
		
	}

}
