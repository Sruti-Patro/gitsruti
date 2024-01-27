import java.lang.*;
import java.util.*;
class p3{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x,y:");
		Point obj1=new Point(sc.nextDouble(),sc.nextDouble());
		System.out.print("Enter x,y:");
		Point obj2=new Point(sc.nextDouble(),sc.nextDouble());
		Point res =new Point(0,0);
		double v=res.distanceBetPoints(obj1,obj2);
		System.out.print("Distance:"+v);
	}
}
class Point{
	double y,x;
	Point(double w,double h)
	{
		x=w;
		y=h;
	}
	double distanceBetPoints(Point a,Point b)
	{
		double d;
		d=(a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
		d=Math.sqrt(d);
		return d;
	}
}