package btech.arithmetic;
public class MyMath{
	float a,b;
	public MyMath(float a,float b){
		this.a=a;
		this.b=b;
	}
	public float sum(){
		return a+b;
	}
	public float diff(){
		return a-b;
	}
	public float mul(){
		return a*b;
	}
	public float div(){
		return a/b;
	}
	public float modulo(){
		return a%b;
	}
}