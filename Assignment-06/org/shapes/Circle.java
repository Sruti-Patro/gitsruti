package org.shapes;
public class Circle{
	float a;
	public Circle(float a){
		this.a=a;
	}
	public float area(){
		return 3.14f*a*a;
	}
	public float perimeter(){
		return 2*3.14f*a;
	}
}