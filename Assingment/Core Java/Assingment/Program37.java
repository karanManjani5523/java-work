package Assingment;

public class Program37 extends Thread {
    private String name;

    public Program37(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    	Program37 thread1 = new Program37("Thread 1");
    	Program37 thread2 = new Program37("Thread 2");

        thread1.start();
        thread2.start();
    }
}