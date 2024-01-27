import java.lang.*;
import java.util.*;
class Point2D {
	int x,y;
	Point2D(){
		x=y=0;
	}
	Point2D(int x,int y){
		this.x=x;
		this.y=y;
	}
	void display(){
		System.out.println("Now in class Point2D");
		System.out.println("x Coordinate:"+x);
		System.out.println("y Coordinate:"+y);
	}
}
class Circle extends Point2D{
	Circle(){
		super();
		radius=0;
	}
	Circle(int x,int y,int r){
		super(x,y);
		radius=r;
	}
	int radius;
	float area(){
		return 3.14f*radius*radius;
	}
}
class Cylinder extends Circle{
	int height;
	Cylinder(){
		super();
		height=0;
	}
	Cylinder(int x,int y,int r,int h){
		super(x,y,r);
		height=h;
	}
	float volume(){
		return 3.14f*radius*radius*height;
	}
}
class p4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x Coordinate:");
		int x=sc.nextInt();
		System.out.println("Enter y Coordinate:");
		int y=sc.nextInt();
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		System.out.println("Enter height:");
		int h=sc.nextInt();
		Cylinder c=new Cylinder(x,y,r,h);
		float a=c.area();
		float v=c.volume();
		System.out.println("Area:"+a);
		System.out.println("Volume:"+v);
	}
}
//2 3 4 5 6 9 10 11
