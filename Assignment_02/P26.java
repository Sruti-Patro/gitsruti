//26.input matrix and disp its transpose
import java.lang.*;
import java.util.*;
class P26
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column respectively:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.printf("Enter a[%d][%d]:",i,j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("before transpose:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.println("After transpose:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
	}
}