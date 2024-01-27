import java.lang.*;
import java.util.*;
import java.io.*;
class P8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float s=0.0f;
		for(int i=0;i<3;i++)
		{
			System.out.println("ENTER Mark:");
			float m=sc.nextFloat();
			s=s+m;
		}
		float avg=s/3.0f;
		System.out.print("Average mark of three subjects:"+avg);
	}
}