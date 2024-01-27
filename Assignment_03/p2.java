import java.lang.*;
import java.util.*;
class p2{
	public static void main(String [] args){
		Student obj=new Student();
		obj.name="John";
		obj.roll_no=20;
		obj.display();
	}
}
class Student{
	String name;
	int roll_no;
	
	void display()
	{
		System.out.println("Name:"+name);
		System.out.print("Roll no.:"+roll_no);
	}
}