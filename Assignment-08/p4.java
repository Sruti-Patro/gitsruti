class OneT extends Thread {
    int n;
    OneT(int a) {
        n = a;
    }
    public void run() {
        // square
        System.out.println("Square: " + (n * n));
    }
}
class TwoT extends Thread {
    int num;
    TwoT(int a){
        num = a;
    }
    public void run() {
        // Sum of digits
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.print("Sum of the digits: " + sum);
    }
}
class p4 {
    public static void main(String args[]) {
        int number = 25;
        OneT a = new OneT(number);
        TwoT b = new TwoT(number);
        a.start();
        b.start();
    }
}