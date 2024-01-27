import java.lang.*;
import java.util.*;
class P14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("no 1:");
		int a=sc.nextInt();
		System.out.println("no 2:");
		int b=sc.nextInt();
		System.out.println("no 3:");
		int c=sc.nextInt();
		int d=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.print("largest no:"+d);
	}
}