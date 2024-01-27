import java.lang.*;
import java.util.*;
class p5{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of employees:");
		int n=sc.nextInt();
		Employee obj[]=new Employee[n];
		for(int i =0;i<n;i++)
			obj[i]=new Employee();
		for(int i =0;i<n;i++)
			obj[i].ini();
		for(int i =0;i<n;i++)
			obj[i].display();
	}
}
class Employee{
	String name,address;
	int yoj,salary;
	void ini()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter address:");
		address=sc.nextLine();
		System.out.print("Enter year of joining:");
		yoj=sc.nextInt();
		System.out.print("Enter salary:");
		salary=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Year of Joining:"+yoj);
		System.out.println("Salary:"+salary);
	}
}