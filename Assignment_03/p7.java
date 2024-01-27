import java.lang.*;
import java.util.*;
class p7{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter salary and number of work hours per day :");
		Employee obj=new Employee();
		obj.getInfo(sc.nextInt(),sc.nextInt());
		obj.addSal();
		obj.addWork();
		obj.display();
	}
}
class Employee{
	int salary,nowh;
	void getInfo(int s,int wh)
	{
		salary=s;
		nowh=wh;
	}
	void addSal()
	{
		if(salary<=500)
			salary+=10;
	}
	void addWork()
	{
		if(nowh>6)
			salary+=5;
	}
	void display()
	{
		System.out.print("Final salary of the employee: "+salary);
	}
}