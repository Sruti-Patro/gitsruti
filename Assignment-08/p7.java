import java.util.Scanner;
class OneT extends Thread {
	int a[],b[];
    OneT(int a[],int b[]) {
        this.a=a;
		this.b=b;
    }
    public void run() {
       for (int i = 1; i < a.length; i += 2) {
            a[i] = a[i] * b[i];
        }
    }
}
class TwoT extends Thread {
    int a[],b[];
    TwoT(int a[],int b[]) {
        this.a=a;
		this.b=b;
    }
    public void run() {
		for (int i = 0; i < a.length; i += 2) {
            a[i] = a[i] * b[i];
        }
    }
}
class p7{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
        int size = sc.nextInt();
		int a[]=new int[size],b[]=new int[size];
		System.out.printf("Enter %d elements for array a:",size);
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();			
		System.out.printf("Enter %d elements for array b:",size);
		for(int i=0;i<size;i++)
			b[i]=sc.nextInt();
        OneT at = new OneT(a,b);
        TwoT bt= new TwoT(a,b);
        bt.start();
        at.start();
		 try {
            bt.join();
            at.join();
        } catch (InterruptedException e) {
            	System.out.print("\nError in join()");
        }
		for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}