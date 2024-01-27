import java.lang.*;
import java.util.*;
class p9{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of employees:");
		int n=sc.nextInt();
		Employee obj[]=new Employee[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter name of employee :");
			String name=sc.nextLine();
			System.out.print("Enter  employee no of employees:");
			int en=sc.nextInt();
			System.out.print("Enter basic salary of employees:");
			float sal=sc.nextFloat();
			System.out.print("Enter da of employees:");
			float dd=sc.nextFloat();
			System.out.print("Enter hra of employees:");
			float hr=sc.nextFloat();
			obj[i]=new Employee(name,en,sal,dd,hr);
			obj[i].calGrossSal();
		}
		for(int i=0;i<n;i++)	
			obj[i].showEmpDetails();
	}
}
class Employee{
	String empName;
	int empNo;
	float basicSal,salary,da, hra, grossSal;
	Employee(String names,int ens,float sals,float dds,float hrs)
	{
		empName=names;
		empNo=ens;
		basicSal=sals;
		da=dds;
		hra=hrs;
	}
	void calGrossSal()
	{
		grossSal=da+hra+basicSal;
	}
	void showEmpDetails()
	{
		System.out.println(empNo+" "+empName+" "+basicSal+" "+da+" "+hra+" "+grossSal);
	}
}