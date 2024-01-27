import java.util.*;
class Person{
		String name;
		Person(String s){
			name=s;
		}
}


class Employee extends Person
{
	private int empid;
	Employee(String s,int id){
		super(s);
		empid=id;
	}
	void display(){
		System.out.println("Name : "+name);
		System.out.println("EmpID:"+empid);
	}
}


class HourlyEmployee extends Employee{
	private int hourlyRate,hoursWorked;
	HourlyEmployee(String s,int id,int hr,int hw){
		super(s,id);
		hourlyRate=hr;
		hoursWorked=hw;
	}
	int getGrossPay(){
		return hourlyRate*hoursWorked;
	}
	void display(){
		System.out.println("Hourly rate : "+hourlyRate);
		System.out.println("Hourly Worked : "+hoursWorked);
		System.out.println("Employee ID:"+getGrossPay());
	}
}


class p6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Name : ");
		String name=sc.next();
		System.out.println("EmpID:");
		int empid=sc.nextInt();
		System.out.println("Hourly rate : ");
		int hourlyRate=sc.nextInt();
		System.out.println("Hourly Worked : ");
		int hoursWorked=sc.nextInt();
		Employee e=new Employee(name,empid);
		HourlyEmployee he=new HourlyEmployee(name,empid,hourlyRate,hoursWorked);
		e.display();
		he.display();
	}
} 