class Thread81 implements Runnable{
	Thread ctr;
	Thread81(){
		ctr=new Thread(this);
		System.out.print("\nThe child class i created:"+ctr);
		//ctr.start();
	}
	public void run(){
			ctr.setName("MyThread");
			System.out.print("\nName of the child class i created:"+ctr.getName());
			System.out.print("\nName of the child class i created:"+this);
			System.out.print("\nThread id of the child class i created:"+ctr.getId());
			System.out.print("\nIs of the child class i created alive?:"+ctr.isAlive());
	}
}
class p1{
	public static void main(String args[]){
		Thread81 ct=new Thread81();
		ct.ctr.start();
	}
}