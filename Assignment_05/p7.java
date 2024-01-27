import java.util.*;
class Student {
    String name;
    int roll;
    Address address;
	static int scount=0;
    Student(String name, int roll, String city, int pin) {
		scount++;
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pin);
		System.out.println("Creating student number "+scount+":");
    }
    public void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("City: " + address.city + ", Pin: " + address.pin);
    }
    class Address {
        String city;
        int pin;
        Address(String city, int pin) {
            this.city = city;
            this.pin = pin;
        }
    }
}
class p7{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Creating student number : ");
		int n=sc.nextInt();
		Student std[]=new Student[n];
		for(int i=0;i<n;i++){
			System.out.println("\nEnter Student Information:");
			System.out.println("Name: ");
			String name=sc.next();
			System.out.println("Roll: ");
			int roll=sc.nextInt();
			System.out.println("City & Pin: ");
			String city=sc.next();
			int pin=sc.nextInt();
			std[i] = new Student(name,roll,city,pin);
		}
		for(int i=0;i<n;i++)
            std[i].displayInfo();
    }
}
