package util;

import java.util.Scanner;


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
     Scanner scanner = new Scanner(System.in);
     Thread1 t1 = new Thread1();
     Thread2 t2 = new Thread2();
     
     while (true) {
         System.out.println("\nMenu:");
         System.out.println("1. Start Thread1");
         System.out.println("2. Start Thread2");
         System.out.println("3. Check Thread States");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         
         switch (choice) {
             case 1:
                 if (!t1.isAlive()) {
                     t1 = new Thread1();
                     t1.start();
                     System.out.println("Thread1 started.");
                 } else {
                     System.out.println("Thread1 is already running.");
                 }
                 break;
             
             case 2:
                 if (!t2.isAlive()) {
                     t2 = new Thread2();
                     t2.start();
                     System.out.println("Thread2 started.");
                 } else {
                     System.out.println("Thread2 is already running.");
                 }
                 break;
             
             case 3:
                 System.out.println("Thread1 state: " + t1.getState());
                 System.out.println("Thread2 state: " + t2.getState());
                 break;
             
             case 4:
                 System.out.println("Exiting program.");
                 scanner.close();
                 return;
             
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}