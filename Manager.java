package day3;

import java.util.Scanner;

public class Manager extends Employee
{
	protected double travelAllowance;
	protected double managerAllowance;
	
	public Manager()
	{
		super();//making a call to the NoArgsConstructor of Super Class
		travelAllowance=100.0;
		managerAllowance=200.0;
	}
	
	public Manager(int a, String b, double c,double d, double e)
	{
		super(a,b,c);//making a call to the ParameterisedConstrucot of Super Clas
		travelAllowance=d;
		managerAllowance=e;
	}
	
	public void acceptManager()
	{
		Scanner sc=new Scanner(System.in);
		super.acceptEmp();
		System.out.println("Enter travelAllowance");
		travelAllowance=sc.nextDouble();
		System.out.println("Enter managerAllowance");
		managerAllowance=sc.nextDouble();
	}
	
	public void displayManager()
	{
		super.displayEmp();
		System.out.println("Travel Allowance "+this.travelAllowance);
		System.out.println("Manager Allowance "+this.managerAllowance);
	}

	public void calcSal()
	{
		System.out.println("bye");
	}
}
