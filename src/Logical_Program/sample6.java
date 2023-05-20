package Logical_Program;

public class sample6 
{
	
	 //how to remove junk or special characters in a string
	 
		public static void main(String...args) 
		{
			String s="gfj484445#$%*(54JbAHDN%^*(";
			
		String	s1=s.replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(s1);
			
		
			
		}

}
