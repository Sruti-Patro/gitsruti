import java.lang.*;
import java.util.*;
class p1{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks of 3:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int o=sc.nextInt();
		Average obj=new Average(m,n,o);
		obj.calc();
	}
}
class Average{
	int m,n,o;
	Average(int a,int b,int c){
		m = a;
		n = b;
		o = c;
	}
	void calc()
	{
		float avg=(m+n+o)/3.0f;
		System.out.print("Average of 3 marks:"+avg);
	}
}