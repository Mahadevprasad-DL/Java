package interfaces;
import java.util.Scanner;

interface personal{
	void accept();
	void display();
	final int age=10;
}

interface  offical{
	void acceptoffical();
	void displayoffical();
}

class A implements personal, offical{
Scanner sc = new Scanner(System.in);

	String des;
	String name;
	public void acceptoffical() {
		System.out.println("Enter your designation :");
		 des = sc.next();
		
		
		
	}

	public void displayoffical() {
		System.out.println("My designation is : "+des);
		
	}

	public void accept() {
		System.out.println("Enter your name : ");
		name=sc.next();
		
	}

	public void display() {
		System.out.println("name : "+name);
		
	}
	
}
public class Employee {
public static void main(String arg[]) {
	personal obj1;
	offical obj2;
	
	
//	obj2=new A();
//	obj2.acceptoffical();
//	obj2.displayoffical();
	
	A obj3=new A();
	obj3.accept();
	obj3.display();
	obj3.acceptoffical();
	obj3.displayoffical();
	System.out.println("final : "+obj3.age);
	
}
}
