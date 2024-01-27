import java.lang.*;
import java.util.*;
import java.io.*;
class P7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER length:");
		float l=sc.nextFloat();
		System.out.println("ENTER breadth:");
		float b=sc.nextFloat();
		float a=l*b;
		System.out.println("Area of this rectangle:"+a);
	}
}