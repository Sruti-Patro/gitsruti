import java.util.Scanner;
class Critical{
	int s=0,i,global=0;
	public void sum(int n){
		try  { 
		s=0;  
		for(i=1;i<=n;i++)
		{
			s=s+i;
		}
		Thread.sleep(2000); 
		global=global+s;
	}
	catch(InterruptedException e) { 
	System.out.println("Interrupted"); 
        } 
     }
}
class ThreadCreate implements Runnable
{
	Thread t;
	Critical c;
	int n;
	ThreadCreate(Critical c,int n){
		this.n=n;
		this.c=c;
		t=new Thread(this);
		t.start();
	}
	public void run(){
		System.out.println(n);
		synchronized(c){
		c.sum(n);	
    System.out.println("Sum of numbers for "+t.getName() +" "+ c.s);
		}
	}
}
class Synchronize1 {
	public static void main(String args[])
	{
		Critical c=new Critical();
		Scanner sc=new Scanner(System.in);
		int m,n,i;
		System.out.println("Enter value of n and m");
		n=sc.nextInt();
		m=sc.nextInt();
		ThreadCreate tc1 = new ThreadCreate(c,n);
		ThreadCreate tc2 = new ThreadCreate(c,m);
		try{
		tc1.t.join();
		tc2.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Interrupt ");
		}
		System.out.println("Resulting Sum = " + c.global);
	}
}
