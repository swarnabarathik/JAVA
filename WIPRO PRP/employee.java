import java.io.*;
import java.util.Scanner;
public class employee {
	int id;
	String name;
	String dept;
	float salary;
	int age;
	String address;
	
	public void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id:");
		id=Integer.parseInt(s.nextLine());
		System.out.println("Enter the name:");
		name=s.nextLine();
		System.out.println("Enter the dept:");
		dept=s.nextLine();
		System.out.println("Enter the salary:");
		salary=Integer.parseInt(s.nextLine());
		System.out.println("Enter the age:");
		age=Integer.parseInt(s.nextLine());
		System.out.println("Enter the address:");
		address=s.nextLine();
	}
	public void printdata()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Dept:"+dept);
		System.out.println("Salary:"+salary);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}

	public static void main(String args[])
	{
		employee[] d=new employee[2];
		for(int i=0;i<2;i++)
		{
			d[i]=new employee();
			d[i].getdata();
		}
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the id to retrive:");
		n=Integer.parseInt(s1.nextLine());
		for(int i=0;i<2;i++)
		{
			if(d[i].id==n)
			d[i].printdata();
		}
	}
}
