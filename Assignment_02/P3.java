import java.lang.*;
import java.util.*;
class P3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		float tax=0.0f;
		System.out.print("Enter your Income:");
		long ic=sc.nextLong();
		if(ic<=150000)
			System.out.print("No Tax :)");
		else if(ic>=150001 && ic<=300000 )
		{
			tax=ic*0.1f;
			System.out.print("You will be charged with a tax of "+tax);
		}
		else if(ic>=300001 && ic<=500000 )
		{
			tax=ic*0.2f;
			System.out.print("You will be charged with a tax of "+tax);
		}
		else
		{
			tax=ic*0.3f;
			System.out.print("You will be charged with a tax of "+tax);
		}
		
	}
}