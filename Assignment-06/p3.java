abstract class Shape{
	abstract void RectangleArea(int a,int b);
	abstract void SquareArea(int a);
	abstract void CircleArea(int a);
}
class Area extends Shape{
	void RectangleArea(int length,int breadth){
		System.out.println("Rectangle Area:"+(length*breadth));
	}
	void SquareArea(int side){
		System.out.println("Square Area:"+(side*side));
	}
	void CircleArea(int radius){
		System.out.print("Circle Area:"+(3.14f*radius*radius));
	}
}
class p3{
	public static void main(String args[]){
		Area a=new Area();
		a.RectangleArea(5,4);
		a.SquareArea(5);
		a.CircleArea(5);
	}
}