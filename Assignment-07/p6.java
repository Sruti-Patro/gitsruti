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
	//deposit
	void deposit(double amt){
		balance+=amt;
		System.out.println("Current balance:"+balance);
	}
	//withdraw
	void withdraw(double amt){
		balance-=amt;
		System.out.println("Current balance:"+balance);
	}
	//transfer
	void transfer(Account acc1, Account acc2, double amt)
	{
		acc1.balance-=amt;
		acc2.balance+=amt;
		System.out.println("Current balance of credited bank:"+acc1.balance);
		System.out.print("Current balance of debited bank:"+acc2.balance);
	}
}
class MinimumBalanceException extends Exception{
	private String action;
	MinimumBalanceException(String a){
		action=a;
	}
	public String toString() { 
		return "\nYour minimum balance should be 500\n this attempt to "+action+" is cancelled as BALANCE of the CREDITED BANK account would be less than 500 after the "+action+"\n"; 
	}
}
class p6{
	public static void main(String args[]) throws MinimumBalanceException
	{
		Account a=new Account("Sruti",556655,500);
		Account b=new Account("Gudli",112211,3100);
		Scanner sc=new Scanner(System.in);
		//deposit
		a.deposit(500.55);
		//withdrawal
		System.out.print("Enter withdrawal amount from bank a:");
		double amt=sc.nextDouble();
		try{
			if(a.balance-amt<=500)
				throw new MinimumBalanceException("Withdrawal");
			else
				a.withdraw(amt);
		}
		catch(MinimumBalanceException e){
			System.out.print(e);
			System.out.println("Current balance:"+a.balance);
		}
		//transfer
		System.out.print("Enter Transfer amount from bank a:");
		amt=sc.nextDouble();
		try{
			if(a.balance-amt<=500)
				throw new MinimumBalanceException("Transfer");
			else
				a.transfer(a,b,amt);
		}
		catch(MinimumBalanceException e){
			System.out.print(e);
			System.out.println("Current balance in bank a:"+a.balance);
			System.out.println("Current balance in bank b:"+b.balance);
		}
	}
}