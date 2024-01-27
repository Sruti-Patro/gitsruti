import org.shapes.*;
import java.util.*;
class p8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("a,b:");
		float a=sc.nextFloat(),b=sc.nextFloat();
		Square s=new Square(a);
		Circle c=new Circle(a);
		Triangle t=new Triangle(a,b);
		System.out.println("Circle Area:"+c.area());
		System.out.println("Circle Perimeter:"+c.perimeter());
		System.out.println("Square Area:"+s.area());
		System.out.println("Square Perimeter:"+s.perimeter());
		System.out.println("Triangle Area:"+t.area());
		System.out.print("Triangle Perimeter:"+t.perimeter()+"\n");
	}
}