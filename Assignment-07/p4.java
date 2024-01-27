import java.util.*;
class p4{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter index position:");
		int value=sc.nextInt();
		System.out.print("Enter a,b:");
		int x=sc.nextInt(),y=sc.nextInt(),z;
		try{
			if(value>=0&&value<a.length)
				System.out.println("Found the entered index position:");
			else
				throw new ArrayIndexOutOfBoundsException();
			z=x/y;
			System.out.println("Result:"+z);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds Exception error:Sruti\nEnter a new array index value next time\n");
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0 error:Sruti\n");
			System.out.println(e);
			System.out.println("Enter a non zero value for b:");
			y=sc.nextInt();
			z=x/y;
			System.out.println("Result:"+z);
		}
	}
}