import java.lang.*;
import java.util.*;
class P4
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		float avg=0.0f;
		int s=0;
		for(int i=1;i<5;i++)
		{
			System.out.printf("Enter your mark out of 100 of subject %d:",i);
			int m=sc.nextInt();
			s+=m;
		}
		avg=s/4.0f;
		System.out.println("Average:"+avg);
		if(avg>=90.0)
			System.out.print("Grade O");
		else if(avg>=80.0 && avg<90.0 )
			System.out.print("Grade E");
		else if(avg>=70.0 && avg<80.0 )
			System.out.print("Grade A");
		else if(avg>=60.0 && avg<70.0 )
			System.out.print("Grade B");
		else if(avg>=50.0 && avg<60.0 )
			System.out.print("Grade C");
		else
			System.out.print("Grade F");
		
	}
}