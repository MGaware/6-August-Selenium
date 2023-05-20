package Logical_Program;

import java.util.Scanner;

public class Scanner1 
{
	//addition by taking input from user
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter num1-");
		int num1=scan.nextInt();
		
		System.out.println("enter num2-");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
		
	}

}
