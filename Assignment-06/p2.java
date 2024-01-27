interface Calculator{
	void add();
	void sub();
	void mul();
	void div();
}
class DemoCalculator implements Calculator{
	double a,b;
	DemoCalculator(double a,double b){
		this.a=a;
		this.b=b;
	}
	public void add(){
		System.out.println("Sum:"+(a+b));
	}
	public void sub(){
		System.out.println("Difference:"+(a-b));
	}
	public void mul(){
		System.out.println("Product:"+(a*b));
	}
	public void div(){
		System.out.println("Result:"+(a/b));
	}
}
class p2{
	public static void main(String args[]){
		Calculator d=new DemoCalculator(5.0,6.0);
		d.add();
		d.sub();
		d.mul();
		d.div();
	}
}