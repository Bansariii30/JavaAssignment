package com.Module1;

import java.util.Scanner;

public class pro4
{
	
	public static void main(String[] args)
	{
		int[] marks=new int[5];
		
		int total = 0;
		int avg=0;
		
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter Marks["+i+"] = ");
			marks[i] = sc.nextInt();
			total = total + marks[i];
			avg=total/5;
		}
		System.out.println("Total is : "+ total);
		System.out.println("Average is :"+ avg);
	
		
	}
		
}


