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
class Point3D extends Point2D{
	int z;
	Point3D(){
		super();
		z=0;
	}
	Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	void show(){
		System.out.println("Now in class Point3D");
		System.out.println("x Coordinate:"+x);
		System.out.println("y Coordinate:"+y);
		System.out.println("z Coordinate:"+z);
	}
}
//2 3 4 5 6 9 10 11
class p3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x Coordinate:");
		int x=sc.nextInt();
		System.out.println("Enter y Coordinate:");
		int y=sc.nextInt();
		System.out.println("Enter z Coordinate:");
		int z=sc.nextInt();
		Point3D c=new Point3D(x,y,z);
		c.display();
		c.show();
	}
}