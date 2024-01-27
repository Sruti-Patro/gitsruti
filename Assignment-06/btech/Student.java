package btech;
public class Student{
	String name;
	int r;
	int a[]=new int[3];
	public Student(String name,int r,int a[]){
		this.name=name;
		this.r=r;
		this.a=a;
	}
	public void Display(){
		int s=0;
		System.out.println("Name:"+name);
		System.out.println("Roll no.:"+r);
		System.out.println("------MARKS------");
		for(int i=0;i<3;i++){
			System.out.printf("Sub %d:       :%d%n",1+i,a[i]);
			s+=a[i];
		}
		System.out.println("Total       :"+s);
		System.out.println("Percentage       :"+(s/3));
		System.out.println("-----------------");
	}
}