import java.lang.*;
import java.util.*;
class P10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Fehrenheit:");
		float f=sc.nextFloat();
		f=f-32;
		float c=f/9*5;
		System.out.print("Celsius:"+c);
	}
}