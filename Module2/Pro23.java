package com.Module2;

import java.util.Scanner;

public class Pro23 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a=sc.nextInt();
		System.out.println("Enter Second Number :");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("The Division is "+c);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
