package com.Module2;
class Member
{
	int age;
	String name,address,phone_number;
	double salary;

	public void Printsalary()
	{
		System.out.println("The salary is "+salary);
	}
}

class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	
	String department;
}

public class Pro12
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		
		
         e1.name="karan";
         e1.phone_number="9876545678";
         e1.age=25;
         e1.address="Ahmedabad";
         e1.salary=20000.00D;
         e1.specialization="Associaction";
         
         System.out.println("Employee Name is "+e1.name);
         System.out.println("Employee Phone Number is "+e1.phone_number);
         System.out.println("Employee Age is " +e1.age);
         System.out.println("Employee Address is "+e1.address);
         System.out.println("Employee Salary  is "+e1.salary);
         System.out.println("Employee Specialization is "+e1.specialization);
         System.out.println();
         System.out.println();
         
         
         Manager m1=new Manager();
         m1.name="priyank";
         m1.phone_number="9876543210";
         m1.age=25;
         m1.address="Ahmedabad";
         m1.salary=30000.00D;
         m1.department="Marketing";
         System.out.println("Manager Name is "+m1.name);
         System.out.println("Manager Phone number is "+m1.phone_number);
         System.out.println("Manager age is "+m1.age);
         System.out.println("Manager Address is "+m1.address);
         System.out.println("Manager salary is "+m1.salary);
         System.out.println("Manager Department is "+m1.department);
         
         
		
	}

}
