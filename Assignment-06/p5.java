interface Servicing {
	void getServiceTime();
}
class Car implements Servicing{
	public void getServiceTime(){
		System.out.println("Service Time of Car: 10 Km");
	}
}
class Bike implements Servicing{
	public void getServiceTime(){
		System.out.println("Service Time of Bike: 5 Km");
	}
}
class p5{
	public static void main(String [] args){
		Car c=new Car();
		Bike b=new Bike();
		c.getServiceTime();
		b.getServiceTime();
	}
}