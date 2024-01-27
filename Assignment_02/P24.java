//24.input 2d arr and sum of the elem disp
import java.lang.*;
import java.util.*;
class P24
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column respectively:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int s=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.printf("Enter a[%d][%d]:",i,j);
				a[i][j]=sc.nextInt();
				s=s+a[i][j];
			}
		}
		System.out.print("Sum:"+s);
	}
}