package util;

class College {
    static String collegeName = "RVCE";  // Static variable (shared by all instances)

    int rollNumber; // Instance variable (specific to each object)

    College(int rollNumber) {
        this.rollNumber = rollNumber;  // Assigning to the instance variable
    }

    void displayDetails(int studentRoll) {
        int localStudent = studentRoll;  // Local variable (only within this method)
        System.out.println("College Name (Static Variable): " + collegeName);
        System.out.println("Local Variable (studentRoll): " + localStudent);
        System.out.println("Instance Variable (rollNumber): " + this.rollNumber);
    }

    public static void main(String[] args) {
        College student1 = new College(101);  // Instance of College
        student1.displayDetails(59);    // Passing local variable value (25)
    }
}
 
