class Shape{
	void Draw(){
		System.out.println("Drawing Shape");
	}
	void Erase(){
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape{
	void Draw(){
		System.out.println("Drawing Circle");
	}
	void Erase(){
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	void Draw(){
		System.out.println("Drawing Triangle");
	}
	void Erase(){
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void Draw(){
		System.out.println("Drawing Square");
	}
	void Erase(){
		System.out.println("Erasing Square");
	}
}
class p10{
	public static void main(String args[]){
		Shape f;
		Circle r=new Circle();
		Triangle t=new Triangle();
		Square s=new Square();
		f=r;
		f.Draw();
		f.Erase();
		f=t;
		f.Draw();
		f.Erase();
		f=s;
		f.Draw();
		f.Erase();
	}
}