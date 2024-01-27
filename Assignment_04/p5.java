import java.lang.*;
import java.util.*;
class p5{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of employees:");
		int n=sc.nextInt();
		Employee obj[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.printf("Enter name,no.,dependancy no. of employee %d:",i+1);
			obj[i]=new Employee (sc.next(),sc.nextInt(),sc.nextInt());
		}
		for(int i=0;i<n;i++)
			obj[i].showEmpDetails();
		for(int i=0;i<n;i++)
		{
			int x=obj[i].depCount();
			if(x>2)
				obj[i].showEmpDetails();
		}
	}
}
class Employee {
	private String empName; 
	private int empNo;
	private int dependentCnt; 
	Employee(String name, int eno, int depcnt)
	{
		empName=name;
		empNo=eno;
		dependentCnt=depcnt;
	}
	void showEmpDetails()
	{
		System.out.println(empNo+" "+empName);
	}
	int depCount(){
		return dependentCnt;
	}
}
