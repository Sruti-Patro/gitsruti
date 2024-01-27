import java.util.*;
class p3{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter index position:");
		int value=sc.nextInt();
		try{
			if(value>=0&&value<a.length)
					System.out.print("Found the entered index position:");
			else
				throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("~Array Index Out Of Bounds Exception error:Sruti\n~Enter a new array index value next time\n");
			System.out.print(e);
		}
	}
}