abstract class Bank {
	abstract float getROI();
}
class SBI extends Bank{
	float roi;
	SBI(float a){
		roi=a;
	}
	float getROI(){
		return roi;
	}
}
class PNB extends Bank{
	float roi;
	PNB(float a){
		roi=a;
	}
	float getROI(){
		return roi;
	}
}
class BOI extends Bank{
	float roi;
	BOI(float a){
		roi=a;
	}
	float getROI(){
		return roi;
	}
}
class p1{
	public static void main(String args[]){
		Bank a;
		SBI s=new SBI(5.3f);
		PNB p=new PNB(4.5f);
		BOI b=new BOI(3.9f);
		a=s;
		System.out.println("Rate of Interest of SBI:"+a.getROI());
		a=p;
		System.out.println("Rate of Interest of PNB:"+a.getROI());
		a=b;
		System.out.println("Rate of Interest of BOI:"+a.getROI());
	}
}