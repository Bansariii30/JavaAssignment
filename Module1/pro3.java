package com.Module1;

import java.util.Scanner;

public class pro3 
{
	public static void main(String[] args) 
	{
		System.out.println("enter year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
		
		
		System.out.println("Print 1 to 10 ");
		int i=1;
		while(i<11)
		{
			System.out.println(i);
			i++;
		}
	}

}
