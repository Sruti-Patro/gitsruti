import java.lang.*;
import java.util.*;
class Point2D {
	int x,y;
	void getCoord(int x,int y){
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
	void getInput(int x,int y,int z){
		this.x=x;
		this.y=y;
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
class p2{
	public static void main(String args[]){
		Point2D p=new Point2D();
		Point3D c=new Point3D();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x Coordinate:");
		int x=sc.nextInt();
		System.out.println("Enter y Coordinate:");
		int y=sc.nextInt();
		System.out.println("Enter z Coordinate:");
		int z=sc.nextInt();
		c.getCoord(x,y);
		c.display();
		c.getInput(x,y,z);
		c.show();
	}
}