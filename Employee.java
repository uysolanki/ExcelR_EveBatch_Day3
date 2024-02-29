package day3;

import java.util.Scanner;

public class Employee {
	protected int eno;
	protected String ename;
	protected double basicSal;
	
	public Employee() //NoArgsConstructor
	{
		eno=1;
		ename = "Unknown";
		basicSal=1000.0;
	}
	
	public Employee(int a,String b, double c) //AllArgsConstructor/Parameterised
	{
		eno=a;
		ename = b;
		basicSal=c;
	}
	public void acceptEmp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Eno");
		eno=sc.nextInt();
		System.out.println("Enter Ename");
		ename=sc.next();
		System.out.println("Enter basic Sal");
		basicSal=sc.nextDouble();
	}
	
	public void displayEmp()
	{
		System.out.println("Emp Number is "+this.eno);
		System.out.println("Emp Name is "+this.ename);
		System.out.println("Emp Basic Salary is"+this.basicSal);
	}	
	
	public void calcSal()
	{
		System.out.println("hi");
	}
}
