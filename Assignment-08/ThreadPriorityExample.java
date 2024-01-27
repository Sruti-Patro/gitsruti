class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Set priorities for threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority (1)
        thread2.setPriority(Thread.MAX_PRIORITY); // Maximum priority (10)

        // Display priorities
        System.out.println("Priority of " + thread1.getName() + ": " + thread1.getPriority());
        System.out.println("Priority of " + thread2.getName() + ": " + thread2.getPriority());

        // Start threads
        thread1.start();
        thread2.start();
    }
}
