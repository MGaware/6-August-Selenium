package Logical_Program;

import java.util.Arrays;

public class sample14 
{
	//how to find maximum and minimum values in array
	
	public static void main(String[] args) 
	{
		
		int a[]= {21,52,78,38,15,92};
		
		int length=a.length-1;
		
		System.out.println(length);
		
		Arrays.sort(a);
		
		int maxvalue=a[a.length-1];
		int minvalue=a[0];
		
		System.out.println("maximum value-"+maxvalue);
		System.out.println("minimum value-"+minvalue);
		
	}

}
