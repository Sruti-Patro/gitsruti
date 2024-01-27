import java.util.*;
class OneT extends Thread {
    int n;
    OneT(int a) {
        n = a;
    }
    public void run() {
        // prime
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.print("The number is composite.\n");
				return;
			}
		}
        System.out.print("The number is prime.\n");
    }
}
class TwoT extends Thread {
    int num;
    TwoT(int a){
        num = a;
    }
    public void run() {
        // palindrome
        int d,r=0,n=num;
        while (num != 0) {
            d= num % 10;
			r=r*10+d;
            num /= 10;
        }
		if(r==n)
			System.out.print("The number is palindrome.\n");
		else
			System.out.print("The number is not palindrome.\n");
    }
}
class p5{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        OneT a = new OneT(number);
        TwoT b = new TwoT(number);
        a.start();
        b.start();
    }
}