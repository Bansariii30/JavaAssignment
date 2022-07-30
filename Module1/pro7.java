package com.Module1;

import java.util.Scanner;

public class pro7
{
	public static void main(String[] args)
	{
		int number,count=0;
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while(number>0)
		{
			number=number/10; 
			count=count+1;
		}
		System.out.println("Number of Digit is :"+count);
		
	}
}


