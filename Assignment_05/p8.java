import java.util.*;
class Bank{
	float getRateOfInterest(){
		return 0.0f;
	}
	void display(){
		System.out.println("Bank Rate of Interest : "+getRateOfInterest());
	}
}
class SBI extends Bank{
	float getRateOfInterest(){
		return 8.0f;
	}
	void display()
	{
		System.out.println("SBI Rate of Interest : "+getRateOfInterest());
	}
}
class ICICI extends Bank{
	float getRateOfInterest(){	
	return 7.0f;
	}
	void display()
	{
		System.out.println("ICICI Rate of Interest : "+getRateOfInterest());
	}
}
class AXIS extends Bank{
	float getRateOfInterest(){
			return 9.0f;
	}
	void display()
	{
		System.out.println("AXIS Rate of Interest : "+getRateOfInterest());
	}
}
class p8{
	public static void main(String args[]){
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		s.display();
		i.display();
		a.display();
	}
}