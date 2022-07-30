package com.Module2;

public class Pro22 
{
	public static void main(String[] args) 
	{
		try
		
		{
			int a=10;
			int b=5;
			int c=a+b;
			System.out.println(c);
			
		}catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}

}
