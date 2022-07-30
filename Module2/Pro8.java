package com.Module2;
class PrintNumber
{

	public int printn(int a)
	{
		System.out.println(a);
		return a;
	}
	public float printn(float a)
	{
		System.out.println(a);
		return a;
	}
	public double printn(double d)
	{
		System.out.println(d);
		return d;
	}
	
}

public class Pro8
{
	public static void main(String[] args) 
	{
		PrintNumber p1=new PrintNumber();
		p1.printn(13);
		p1.printn(78.90F);
		p1.printn(566.89D);
		
		
	}

}
