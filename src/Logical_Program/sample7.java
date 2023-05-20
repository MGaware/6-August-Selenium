package Logical_Program;

import java.util.Scanner;

public class sample7 
{
	
	//find largest of 3 numbers 
	
		public static void main(String...args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a-");
			int a=scan.nextInt();
			System.out.println("enter b-");
			int b=scan.nextInt();
			System.out.println("enter c-");
			int c=scan.nextInt();
			
			
			if(a>b & a>c) 
			{
				System.out.println(a+" is largest number ");
				
			}
			else if (b>a & b>c)
			{
				System.out.println(b+" is largest number");
				
			}
			else
			{
				System.out.println(c+" is largest number");
			}
			
			
			
		}

}
