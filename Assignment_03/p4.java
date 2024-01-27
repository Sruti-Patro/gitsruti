import java.lang.*;
import java.util.*;
class p4{
	public static void main(String [] args){
		Complex obj2=new Complex();
		Complex obj1=new Complex();
		Complex res=new Complex();
		obj1.ini();
		obj2.ini();
		res.add(obj1,obj2);
		res.display();
	}
}
class Complex{
	float r,i;
	void ini()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real and imaginary value of no.:");
		r=sc.nextFloat();
		i=sc.nextFloat();
	}
	void add(Complex a,Complex b)
	{
		r=a.r+b.r;
		i=a.i+b.i;
	}
	void display()
	{
		System.out.printf("%f+i%f",r,i);
	}
}