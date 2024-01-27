import java.util.*;
class Thread83 implements Runnable{
	Thread ctr;
	int m,n;
	Thread83(int m,int n){
		ctr= new Thread(this,"Sruti01");
		this.m=m;
		this.n=n;
	}
	public void run(){
		while(m<=n){
			if(m%2==0)
			System.out.print("\n"+m);
			m++;
		}
	}
}
class Mian extends Thread{
	int m,n;
	Mian(int m,int n){
		this.m=m;
		this.n=n;
	}
	public void run(){
	try{
		Thread.sleep(3000);
		while(m<=n){
			if(m%2!=0)
			System.out.print("\n"+m);
			m++;
		}
	}
	catch(InterruptedException e){
		System.out.print("\nError");
	}
	}
}
class p3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a number:");
		int n=sc.nextInt();
		Thread83 ct=new Thread83(1,10);
		System.out.print("\nThread82:"+ct.ctr.isAlive());
		ct.ctr.start();
		System.out.print("\nThread82:"+ct.ctr.isAlive());
		Mian mt=new Mian(1,10);
		mt.start();
	}
}