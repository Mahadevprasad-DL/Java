package util;

import java.util.Scanner;

class Storage<T> {
 private T obj;

 public Storage(T obj) {
     this.obj = obj;
 }

 public void setItem(T obj) {
     this.obj = obj;
 }

 public T getItem() {
     return obj;
 }
}

class GenericMethods {
 public static <E> void printArray(E[] array) {
     for (E element : array) {
         System.out.print(element + " ");
     }
     System.out.println();
 }
}

public class GenericDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter an Integer value: ");
     Integer intValue = scanner.nextInt();
     Storage<Integer> intStorage = new Storage<>(intValue);

     scanner.nextLine(); 
     System.out.print("Enter a String value: ");
     String strValue = scanner.nextLine();
     Storage<String> stringStorage = new Storage<>(strValue);

     System.out.println("\nStored values:");
     System.out.println("Integer stored: " + intStorage.getItem());
     System.out.println("String stored: " + stringStorage.getItem());
     
     
     

     System.out.print("\nEnter the size of the Integer array: ");
     int intSize = scanner.nextInt();
     Integer[] intArray = new Integer[intSize];

     System.out.println("Enter " + intSize + " Integer values:");
     for (int i = 0; i < intSize; i++) {
         intArray[i] = scanner.nextInt();
     }

     
    // Strings
     scanner.nextLine();
     System.out.print("\nEnter the size of the String array: ");
     int strSize = scanner.nextInt();
     scanner.nextLine(); 
     String[] stringArray = new String[strSize];

     System.out.println("Enter " + strSize + " String values:");
     for (int i = 0; i < strSize; i++) {
         stringArray[i] = scanner.nextLine();
     }

    // Double
     
     System.out.print("\nEnter the size of the Double array: ");
     int dblSize = scanner.nextInt();
     Double[] doubleArray = new Double[dblSize];

     System.out.println("Enter " + dblSize + " Double values:");
     for (int i = 0; i < dblSize; i++) {
         doubleArray[i] = scanner.nextDouble();
     }

     System.out.println("\nPrinting Integer Array:");
     GenericMethods.printArray(intArray);

     System.out.println("\nPrinting String Array:");
     GenericMethods.printArray(stringArray);

     System.out.println("\nPrinting Double Array:");
     GenericMethods.printArray(doubleArray);

     scanner.close();
 }
}
