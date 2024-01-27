package org.shapes;
public class Square{
	float a;
	public Square(float a){
		this.a=a;
	}
	public float area(){
		return a*a;
	}
	public float perimeter(){
		return 4*a;
	}
}