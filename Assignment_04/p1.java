import java.lang.*;
import java.util.*;
class p1{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter width,height,depth:");
		Box obj=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		double v=obj.volume();
		System.out.print("Volume:"+v);
	}
}
class Box{
	double width,height,depth;
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
}