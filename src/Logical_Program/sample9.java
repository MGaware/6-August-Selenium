package Logical_Program;

public class sample9 
{
	//how to count occurance of a character in a string
	
	public static void main(String[] args) 
	{
		String a="mahesh kalyan gaware";
		
		int totalcount=a.length();
		
		int totalcount_without_a=a.replace("a", "").length();
		
		System.out.println("count of 'a'-"+(totalcount-totalcount_without_a));
		
		
	}

}
