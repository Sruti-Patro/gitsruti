import java.lang.*;
import java.util.*;
class p6{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lenght and breadth:");
		Area obj=new Area();
		obj.setDim(sc.nextInt(),sc.nextInt());
		int area=obj.setArea();
		System.out.print("Area:"+area);
	}
}
class Area{
	int l,b;
	void setDim(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	int setArea()
	{
		return l*b;
	}
}