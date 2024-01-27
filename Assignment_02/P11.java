import java.lang.*;
import java.util.*;
class P11
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n, count = 0, a, b, c, sum = 0;
        for(int i=1;i<=10000;i++)
        {
            n=i;
            while(n>0)
            {
                b=n%10;
                sum=sum+(b*b*b);
                n=n/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
            sum=0;
        }
	}
}