package Assingment;

class TestThreadTwice1 extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("TestThreadTwice1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program39 {
    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        try {
            t1.start(); // This will throw an IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println("Cannot start the same thread twice!");
        }
    }
}