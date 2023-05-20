package Logical_Program;

import java.util.Scanner;

public class Scanner_even_odd 
{
	//verify even-odd number by taking input from user
	
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter num-");
		int num=scan.nextInt();
		
		if(num%2==0) 
		{
			System.out.println("given number is an even number");
			
		}
		else 
		{
			System.out.println("given number is an odd number");
			
		}
		
		
	}

}
