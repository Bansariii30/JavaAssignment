package com.Module2;
class Parent
{
	public void method1()
	{
		System.out.println("This is Parent class..... ");
	}
	
	
}
class Child extends Parent
{
	public void method2()
	{
		System.out.println("This is Child class.....");
	}
}


public class Pro11
{
	public static void main(String[] args)
	{
		
		Parent p1=new Parent();
		p1.method1();
		Child obj=new Child();
		obj.method2();
		//System.out.println("Method of parent class by object of child class ");
		obj.method1();

	}

}
