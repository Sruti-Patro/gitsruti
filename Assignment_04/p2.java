import java.lang.*;
import java.util.*;
class p2{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real no. & imaginary no.:");
		ComplexNum obj1=new ComplexNum(sc.nextDouble(),sc.nextDouble());
		System.out.print("Enter real no. & imaginary no.:");
		ComplexNum obj2=new ComplexNum(sc.nextDouble(),sc.nextDouble());
		obj1.displayCompNumber();
		obj2.displayCompNumber();
		ComplexNum res=new ComplexNum(0.0,0.0);
		res.addCompNumber(obj1,obj2);
		res.displayCompNumber();
	}
}
class ComplexNum{
	double real,imaginary;
	ComplexNum(double w,double h)
	{
		real=w;
		imaginary=h;
	}
	void displayCompNumber()
	{
		System.out.println(real+"+"+imaginary+"i");
	}
	void addCompNumber(ComplexNum a,ComplexNum b)
	{
		real=a.real+b.real;
		imaginary=a.imaginary+b.imaginary;
	}
}