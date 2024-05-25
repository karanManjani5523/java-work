package Assingment;

class TestDaemonThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program40 {
    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();

        t1.setDaemon(true); // Set t1 as a daemon thread
        t1.start();
        t2.start();

        System.out.println("t1 is daemon: " + t1.isDaemon());
        System.out.println("t2 is daemon: " + t2.isDaemon());
    }
}