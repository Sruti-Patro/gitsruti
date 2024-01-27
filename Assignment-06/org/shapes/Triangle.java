package org.shapes;
public class Triangle{
	float a,b;
	public Triangle(float a,float b){
		this.a=a;
		this.b=b;
		//this.c=c;
	}
	public float area(){
		return 0.5f*b*a;
	}
	public float perimeter(){
		return a+b+a;
	}
}