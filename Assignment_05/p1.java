import java.lang.*;
import java.util.*;
class Parent{
	void displayp(){
		System.out.println("This is PARENT class.");
	}
}
class Child extends Parent{
	void displayc(){
		System.out.println("This is CHILD class.");
	}
}
//2 3 4 5 6 9 10 11
class p1{
	public static void main(String args[]){
		Parent p=new Parent();
		Child c=new Child();
		p.displayp();
		c.displayc();
		c.displayp();
	}
}