import java.lang.*;
import java.util.*;
class p4{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter hour,minute,second:");
		Time obj1=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.print("Enter hour,minute,second:");
		Time obj2=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
		Time res =new Time(0,0,0);
		obj1.displayTime();
		obj2.displayTime();
		res.addTime(obj1,obj2);
		res.displayTime();
	}
}
class Time{
	int hour,minute,second;
	Time(int h,int m,int s)
	{
		hour=h;
		minute=m;
		second=s;
	}
	void displayTime()
	{
		System.out.println(hour+":"+minute+":"+second);
	}
	void addTime(Time a,Time b){
		int h,m,s;
		s=a.second+b.second;
		second=s%60;
		m=a.minute+b.minute;
		minute=(m%60)+(s/60);
		h=a.hour+b.hour;
		hour=h+(m/60);
	}
}