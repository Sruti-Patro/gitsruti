import java.util.*;
class Figure {
	float dim1 , dim2;
	Figure(int dim1,int dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	float area(){
		return 0.0f;
	}
}
class Rectangle extends Figure{
	Rectangle(int dim1,int dim2){
		super(dim1,dim2);
	}
	float area(){
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(int dim1,int dim2){
		super(dim1,dim2);
	}
	float area(){
		return 0.5f*dim1*dim2;
	}
}
class Square extends Figure{
	Square(int dim1){
		super(dim1,dim1);
	}
	float area(){
		return dim1*dim2;
	}
}
class p9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("dim1:");
		int dim1=sc.nextInt();
		System.out.println("dim2: ");
		int dim2=sc.nextInt();
		Figure f;
		Rectangle r=new Rectangle(dim1,dim2);
		Triangle t=new Triangle(dim1,dim2);
		Square s=new Square(dim1);
		float area;
		f=r;
		System.out.println("Area of Rectangle : "+f.area());
		f=t;
		System.out.println("Area of Triangle : "+f.area());
		f=s;
		System.out.println("Area of Square : "+f.area());
	}
}