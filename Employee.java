//Classes and Object 


package util;

public class Employee {  // class
	String name;         // attributes
	int age;
	String empid;
	public void display() {     // method
		System.out.println("Employee name :"+ name);
		System.out.println("Employee empid :"+ empid);
		System.out.println("Employee age :"+ age);
		}
public static void main(String[] arg) {
		Employee emp1= new Employee(); // object
		Employee emp2= new Employee();  // object 
		emp1.name ="Girish";
		emp1.empid ="giri059";
		emp1.age =21;
		
		emp2.name ="Mahadev";
		emp2.empid ="Mahadev059";
		emp2.age =21;
		
		emp1.display();
		emp2.display(); // Method calling 			
	}

}
