import java.util.*;
class p1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a,b:");
		int a=sc.nextInt(),b=sc.nextInt();
		try
		{
			System.out.println("Result:"+(a/b));
		}
		catch(ArithmeticException e){
			System.out.print("In catch block\n");
			System.out.println(e);
			System.out.print("\nSruti: You have attempted to divide a number by zero.\n");
			System.out.print("\nEnter a non zero value for b:");
			b=sc.nextInt();
			if (b==0) {
					throw new ArithmeticException("Sruti: Recurrance of division by zero.");
			}
			System.out.println("Result:"+(a/b));
		}
	}
}