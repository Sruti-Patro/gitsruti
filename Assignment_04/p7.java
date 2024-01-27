import java.lang.*;
class p7{
	public static void main(String [] args){
		LcmGcd ob=new LcmGcd(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		ob.meth();
		System.out.println("LCM:"+ob.lcm);
		System.out.print("GCD:"+ob.gcd);
	}
}
class LcmGcd{
	int a,b,lcm,gcd;
	LcmGcd(int a,int b){
		this.a=a;
		this.b=b;
		lcm=gcd=1;
	}
	void meth()
	{
		int c=(a<b)?a:b;
		for(int i=2;i<=c;i++){
			if(a%i==0&&b%i==0)
				gcd=i;
		}
		lcm=(a*b)/gcd;
	}
}