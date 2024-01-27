import java.lang.*;
import java.util.*;
import java.io.*;
class P6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER RADIUS:");
		int r=sc.nextInt();
		float a=r*r*3.14f;
		System.out.println("Area of circle:"+a);
	}
}