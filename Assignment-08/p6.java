import java.util.*;
class OneT extends Thread {
    OneT(String a) {
        super(a);
    }
   public void run() {
        System.out.println(getName() + " is running at priority of "+getPriority());
    }
}
class TwoT extends Thread {
    TwoT(String a){
        super(a);
    }
    public void run() {
        System.out.println(getName() + " is running at priority of "+getPriority());
    }
}
class p6{
    public static void main(String args[]) {
        OneT a = new OneT("OneT");
        TwoT b = new TwoT("TwoT");
		a.setPriority(5);
        b.setPriority(2);
        a.start();
        b.start();
    }
}