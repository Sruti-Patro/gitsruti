class Rectangle{
	int a,b;
	Rectangle(int a,int b){
		this.a=a;
		this.b=b;
	}
	int area()
	{
		return a*b;
	}
	void display(int x)
	{
		System.out.print("Area:"+x);
	}
}
class p3{
	public static void main(String [] args){
		Rectangle a=new Rectangle(4,5);
		Rectangle b=new Rectangle(5,8);
		a.display(a.area());
		b.display(b.area());
	}
}