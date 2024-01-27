//23.input arr &disp element whether they are prime or composite
import java.lang.*;
import java.util.*;
class P23
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int c;
		for(int i=0;i<n;i++)
		{
			System.out.printf("enter a[%d]:",i);
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c=0;
			if(a[i]<2){
				System.out.printf("%na[%d]:Neither Prime nor composite",i);
				//break;
			}
			for(int j=2;j<a[i];j++){
				if(a[i]%j==0){
					c++;
					break;
				}
			}
			if(c==0)
				System.out.printf("%na[%d]:Prime",i);
			else
				System.out.printf("%na[%d]:Composite",i);
		}
	}
}