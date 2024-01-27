import java.util.*;
class Account{
	String name;
	int acc_no;
	double balance;
	Account(String name, int acc_no, double balance){
		this.name=name;
		this.acc_no=acc_no;
		this.balance=balance;
	}
	void deposit(double amt){
		balance+=amt;
		System.out.println("Current balance:"+balance);
	}
	void withdraw(double amt){
		balance-=amt;
		System.out.println("Current balance:"+balance);
	}
}
class MinimumBalanceException extends Exception{
	public String toString() { 
		return "Your minimum balance should be 500\nThis attempt to withdraw is cancelled as your balance would be less than 500 after transaction\n"; 
	}
}
class p5{
	public static void main(String args[]) throws MinimumBalanceException
	{
		Account a=new Account("Sruti",556655,500);
		Scanner sc=new Scanner(System.in);
		a.deposit(500.55);
		System.out.print("Enter withdrawal amount:");
		double amt=sc.nextDouble();
		try{
			if(a.balance-amt<=500)
				throw new MinimumBalanceException();
			else
				a.withdraw(amt);
		}
		catch(MinimumBalanceException e){
			System.out.print(e);
			System.out.println("Current balance:"+a.balance);
		}
	}
}