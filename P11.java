import java.lang.*;
import java.util.*;
class P11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Time in seconds:");
		int ss=sc.nextInt();
		int h,m,s;
		h=ss/3600;
		ss=ss%3600;
		//System.out.println(ss);
		m=ss/60;
		ss=ss-(m*60);
		//System.out.println(ss);
		s=ss;
		System.out.printf("%dHour:%d minute:%d seconds",h,m,s);
	}
}