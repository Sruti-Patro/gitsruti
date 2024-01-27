import java.lang.*;
import java.util.*;
class p6{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of accounts you want to create:");
		int n=sc.nextInt();
		Account acc[]=new Account[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter account no.:");
			int ac=sc.nextInt();
			System.out.print("Enter balance:");
			int bal=sc.nextInt();
			System.out.print("Enter time period in years:");
			int inte=sc.nextInt();
			acc[i]=new Account (ac,bal,inte);
		}
		for(int i=0;i<n;i++){
			System.out.println("");
			System.out.println(1+i+":");
			float interest=acc[i].calculateInterst();
			acc[i].showAccDetails(interest);
		}
		System.out.print("Enter the new Rate of Interest:");
		acc[0].changeIntRate(sc.nextFloat());
		System.out.print(acc[0].intInYears);
	}
}
class Account {
	int accNo, balance, timePeriod;
	static float intInYears=7.5f;
	Account(int accNo,int balance,int timePeriod)
	{
		this.accNo=accNo;
		this.balance=balance;
		this.timePeriod=timePeriod;
	}
	float calculateInterst()
	{
		return (balance*timePeriod*intInYears)/100.0f;
	}
	void showAccDetails(float interest)
	{
		System.out.println("Account no.:"+accNo);
		System.out.println("Balance:"+balance);
		System.out.println("Interest:"+interest);
	}
	static void changeIntRate(float newRate)
	{
		intInYears=newRate;
	}
}