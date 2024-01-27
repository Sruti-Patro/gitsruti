//25.add 2 matrics
import java.lang.*;
import java.util.*;
class P25
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column respectively for matrix 1:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter row and column respectively for matrix 2:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int b[][]=new int[r1][c1];
		if(r==r1&&c==c1){
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.printf("Enter a[%d][%d]:",i,j);
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.printf("Enter b[%d][%d]:",i,j);
					b[i][j]=sc.nextInt();
				}
			}
			int s[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					s[i][j]=a[i][j]+b[i][j];
				}
			}
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
					System.out.print(s[i][j]+" ");
				System.out.println();
			}
		}
		else{
			System.out.print("Addition not possible");
		}
	}
}