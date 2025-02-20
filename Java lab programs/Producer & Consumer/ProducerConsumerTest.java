package util;

class SharedBuffer {
 private int data;
 private boolean hasData = false;

 public synchronized void produce(int value) {
     while (hasData) {
         try {
             wait(); // Wait if buffer is full
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     data = value;
     hasData = true;
     System.out.println("Producer put: " + data);
     notify(); 
 }

 public synchronized int consume() {
     while (!hasData) {
         try {
             wait(); // Wait if buffer is empty
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     hasData = false;
     System.out.println("Consumer got: " + data);
     notify();
     return data;
 }
}

class Producer implements Runnable {
 private SharedBuffer buffer;

 public Producer(SharedBuffer buffer) {
     this.buffer = buffer;
 }

 public void run() {
     for (int i = 1; i <= 5; i++) {
         buffer.produce(i);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

class Consumer implements Runnable {
 private SharedBuffer buffer;

 public Consumer(SharedBuffer buffer) {
     this.buffer = buffer;
 }

 public void run() {
     for (int i = 1; i <= 5; i++) {
         buffer.consume();
         try {
             Thread.sleep(1500); 
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

public class ProducerConsumerTest {
 public static void main(String[] args) {
     SharedBuffer buffer = new SharedBuffer(); 

     Producer producer = new Producer(buffer);
     Consumer consumer = new Consumer(buffer);

     Thread producerThread = new Thread(producer);
     Thread consumerThread = new Thread(consumer);

     producerThread.start();
     consumerThread.start();
 }
}
