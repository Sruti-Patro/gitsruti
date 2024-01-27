import java.lang.*;
import java.util.*;
import java.io.*;
class P9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int p,r,t;
		float si;
		System.out.println("Pricipal amount:");
		p=sc.nextInt();
		System.out.println("Rate per annum:");
		r=sc.nextInt();
		System.out.println("Time in years:");
		t=sc.nextInt();
		si=(p*r*t)/100.0f;
		System.out.print("Simple Interest:"+si);
	}
}