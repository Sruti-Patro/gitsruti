import java.lang.*;
import java.util.*;
class P12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Distance in metre:");
		int d=sc.nextInt();
		int km,m;
		km=d/1000;
		m=d%1000;
		System.out.printf("%d km:%d metre",km,m);
	}
}