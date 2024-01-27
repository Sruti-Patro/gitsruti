import java.lang.*;
import java.util.*;
class Account {
	int accNo;
	String name;
	Account (int no,String na){
		accNo=no;
		name=na;
	}
	void display(){
		System.out.println("Account no.:"+accNo);
		System.out.println("Customer Name:"+name);
	}
}
class Savings_Account extends Account {
	int min_bal,saving_bal; 
	Savings_Account(String a,int b,int c,int d){
		super(b,a);
		min_bal=c;
		saving_bal=d;
	}
	void show(){
		display();
		System.out.println("Current Minimum balance:"+min_bal);
		System.out.println("Current Saving balance:"+saving_bal);
	}
}
class Account_details extends Savings_Account{
	int deposit,withdrawl;
	Account_details(String a,int b,int c,int d,int e,int f){
		super(a,b,c,d);
		deposit=e;
		withdrawl=f;
	}
	void show1(){
		show();
		System.out.println("Current deposit:"+deposit);
		System.out.println("Current Withdrawl:"+withdrawl);
	}
}
//2 3 4 5 6 9 10 11
class p5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name:");
		String a=sc.next();
		System.out.println("Enter Account number:");
		int b=sc.nextInt();
		System.out.println("Enter withdrawl amount:");
		int c=sc.nextInt();
		System.out.println("Enter deposit amount:");
		int d=sc.nextInt();
		System.out.println("Enter min balance:");
		int e=sc.nextInt();
		System.out.println("Enter saving balance:");
		int f=sc.nextInt();
		Account_details cc=new Account_details(a,b,e,f,d,c);
		cc.display();
		cc.show();
		cc.show1();
	}
}