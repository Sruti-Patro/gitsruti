import btech.Student;
import java.util.*;
class p6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:");
		String name=sc.next();
		System.out.println("Roll no.:");
		int r=sc.nextInt();
		int a[]=new int[3];
		System.out.println("------ENTER 3 MARKS------");
		for(int i=0;i<3;i++){
			System.out.printf("For Sub %d: ",1+i);
			a[i]=sc.nextInt();
		}
		Student s=new Student(name,r,a);
		s.Display();
	}
}