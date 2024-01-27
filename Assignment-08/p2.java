import java.util.*;
class Thread82 implements Runnable{
	Thread ctr;
	int n;
	Thread82(int n){
		ctr= new Thread(this,"Sruti01");
		this.n=n;
	}
	public void run(){
		//System.out.print("\n It's a palindrome no.");
		int rep=n,s=0,d;
		while(n!=0){
			d=n%10;
			s=s*10+d;
			n/=10;
		}
		if(s==rep)
			System.out.print("\n It's a palindrome no.");
		else
			System.out.print("\n It's not a palindrome no.");
	}
}
class Mian extends Thread{
	int n;
	Mian(int n){
		this.n=n;
	}
	public void run(){
	try{
		Thread.sleep(3000);
			int c=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.print("\n It's a composite no.");
				c=1;
				break;
			}
		}
		if(c==0)
			System.out.print("\n It's a Prime no.");
	}
	catch(InterruptedException e){
		System.out.print("\nError");
	}
	}
}
class p2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a number:");
		int n=sc.nextInt();
		Thread82 ct=new Thread82(n);
		System.out.print("\nThread82:"+ct.ctr.isAlive());
		ct.ctr.start();
		System.out.print("\nThread82:"+ct.ctr.isAlive());
		Mian mt=new Mian(n);
		mt.start();
	}
}