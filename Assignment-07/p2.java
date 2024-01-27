import java.util.*;
class p2{
	public static void main(String args[]){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter x,y:");
			int x=sc.nextInt(),y=sc.nextInt();
			float c=x-y;
			if(c==0)
				throw new Exception();
			else
				System.out.println("Result:"+x/c);
		}
		catch(Exception e){
			System.out.print("Divide by 0 error\nSruti:Enter values for which x-y is not zero\n");
			System.out.print(e);
		}
	}
}