package com.Module2;

class Areaofsquewrectangle
{
	
	public void area(double a)
	{
		//area of squre 
		System.out.println("The area of Squre is "+(a*a));
		
	}
	public void area(double w,double l)

        {
		//area of rectange
		System.out.println("The area of Rectange is "+(l*w));
		}
}

public class Pro10
{
	public static void main(String[] args)
	{
		Areaofsquewrectangle a1=new Areaofsquewrectangle();
		a1.area(25);
		a1.area(10, 56);
		
	}

}
