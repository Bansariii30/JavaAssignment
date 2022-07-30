package com.Module2;

import java.util.Scanner;

public class Pro24 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter Values");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<6;i++)
		{
		   System.out.println(a[i]);
		}
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		
	}

}
