import btech.arithmetic.MyMath;
import java.util.*;
class p7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("a,b:");
		float a=sc.nextFloat(),b=sc.nextFloat();
		MyMath s=new MyMath(a,b);
		System.out.println("a+b:"+s.sum());
		System.out.println("a-b:"+s.diff());
		System.out.println("a*b:"+s.mul());
		System.out.println("a/b:"+s.div());
		System.out.print("a%b:"+s.modulo()+"\n");
	}
}