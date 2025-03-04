package util;

class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1 interrupted");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 10; i <= 15; i++) {
                System.out.println("Thread2: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread2 interrupted");
        }
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        while (t1.isAlive() || t2.isAlive()) {
            System.out.println("Thread1 state: " + t1.getState());
            System.out.println("Thread2 state: " + t2.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Both threads have finished execution.");
    }
}
