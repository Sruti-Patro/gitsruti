import java.util.*;
abstract class Figure {
	float dim1 , dim2;
	
	abstract float getArea();
}
class Rectangle extends Figure{
	Rectangle(int dim1,int dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	float getArea(){
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(int dim1,int dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	float getArea(){
		return 0.5f*dim1*dim2;
	}
}
class p11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("dim1:");
		int dim1=sc.nextInt();
		System.out.println("dim2: ");
		int dim2=sc.nextInt();
		Figure f;
		Rectangle r=new Rectangle(dim1,dim2);
		Triangle t=new Triangle(dim1,dim2);
		float area;
		f=r;
		area=f.getArea();
		System.out.println("Area of Rectangle : "+area);
		f=t;
		area=f.getArea();
		System.out.println("Area of Triangle : "+area);
	}
}