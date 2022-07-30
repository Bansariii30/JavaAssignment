package com.Module1;

import java.util.Scanner;

public class pro1 
{
	    public static void main(String[] args)
	    {
		   Scanner stc=new Scanner(System.in);
		   System.out.println("Enter first Number : ");
		   int a=stc.nextInt();
		
		   System.out.println("Enter Second Number : ");
		   int b=stc.nextInt();
		
		   System.out.println("Enter Third  Number : ");
		   int c=stc.nextInt();
		
		if(a>b)
		{
			 if(a>c)
			  {
				System.out.println("A is maximum ");
			  }
			else
			  {
				System.out.println("C is maximum ");
			  }
		
		}
		else
		{
			System.out.println("B is maximum ");
		}
		
	}

}
